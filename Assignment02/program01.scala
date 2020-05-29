object SalaryProblem{
    def main(args: Array[String]){
        printf("%.2f",finalSalary(40,20));
    }
    def wage(hours:Int):Int ={
        hours*150;
    }
    def ot(hours:Int):Int ={
        hours*75;
    }
    def income(h1:Int,h2:Int):Int ={
        wage(h1) + ot(h2);
    }
    def tax(income:Int):Double ={
        income*.1;
    }
    def finalSalary(h1:Int,h2:Int):Double ={
        //assume that 4 weeks for month
        //to get the monthly salary multiply by 4
        (income(h1,h2) - tax(income(h1,h2)))*4;
    }

   
}
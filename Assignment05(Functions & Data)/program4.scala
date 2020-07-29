//Include answers for 4.1,4.2,4.3 questionss
object solution extends App{
    //create demo accounts for simulation
    var a1 = new Account("981602838v",1001,10000);
    var a2 = new Account("987654321v",1002,5000);
    var a3 = new Account("981234567v",1003,-1500);
    var a4 = new Account("981789567v",1004,9975);
    var a5 = new Account("971900067v",1005,-7500);

    var bank:List[Account] = List(a1,a2,a3,a4,a5);
    println("----Bank Accounts----");
    println(bank);
    //negative balances
    val overdraft = (b:List[Account]) => b.filter(x=> x.balance < 0);
    println("----Overdraft accounts----");
    println(overdraft(bank))
    //sum of all account balances
    val balance = (a:List[Account])=> a.reduce((x,y)=> (new Account(x.nic,x.acnumber,x.balance+y.balance)))
    println("----Sum of account balances----");
    println(balance(bank).balance)
    //set interest for the accounts 
    //  for positive balance -> deposit interest is .05  
    //  for negative balance -> overdraft interest is .1
    val interest = (acc: List[Account])=> acc.map(x=> {
    if(x.balance<0)  (new Account(x.nic,x.acnumber,x.balance*1.05)) else (new Account(x.nic,x.acnumber,x.balance*1.1))})
    println("----Accounts after interest-----");
    println(interest(bank))
   
}
// used program3.scala data structure
class Account(id:String,n:Int,b:Double){
    val nic:String = id
    val acnumber:Int = n
    var balance:Double = b

    def withdraw(a:Double)= this.balance = this.balance - a

    def deposit(a:Double) = this.balance = this.balance + a

    def transfer(a:Account, b:Double){
        a.balance += b;
        this.balance -=b;
    }

    override def toString = "[ "+nic+" : "+acnumber+" : "+balance+" ]";
}
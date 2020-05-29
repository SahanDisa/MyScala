object SalaryProblem{
    def main(args: Array[String]){
        print(profit(5),profit(10),profit(15),profit(20),profit(25),profit(30),profit(35));
        //best ticket price is 25
        
    }
    def profit(ticketcost:Int):Int={
        revenue(ticketcost) - cost(ticketcost);
    }
    def revenue(ticket:Int):Int={
        //calculate num of attendee
        countAttend(ticket)*ticket;
    }
    def cost(ticketcost:Int):Int={
        //calculate total cost
        500 + 3*countAttend(ticketcost);
    }
    def countAttend(ticketprice:Int):Int ={
        //calculate number of attendee
        120 + ((15- ticketprice)/5)*20;
    }
}
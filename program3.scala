object BookCost{
    def main(args: Array[String]){
       println("\n--------Book Cost---------\n"); 
       var coverPrice: Double = 24.95;//cover price of the book
       var discount: Double = 0.4;//discount
       var n: Int = 60;//quantity
       var Cost:Double = 0;//total cost
       if(n>50){
            Cost = (24.95*n + 3*(50))*discount + 0.75*(n-50);
       }else{
           Cost = (24.95*n + 3*(n))*discount;
       }
       
       println("Wholesale Price is : "+Cost);
    }
}

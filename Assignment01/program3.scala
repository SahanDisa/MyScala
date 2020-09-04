object BookCost{
    def main(args: Array[String]){
        BooksPrice();
    }
    def BooksPrice(){
     println("\n--------Book Cost---------\n"); 
       var coverPrice: Double = 24.95;//cover price of the book
       var n: Int = 60;//quantity
       var Cost:Double = 0;//total cost
       var discount: Double = 0.6;//discount
       if(n>50){
            Cost = (24.95*n)*discount + 3*(50) + 0.75*(n-50);
       }else{
           Cost = (24.95*n)*discount + 3*(n);
       }
       
       println("Wholesale Price is : "+Cost);
    }
}
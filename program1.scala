object TemperatureConverter{
    def main(args: Array[String]){
       println("--------Cellius to Fahrenhate---------"); 
       var C: Double = 35;
       var F: Double = 0;
       F = C*1.8 + 32;
       println("Value is : "+F);
    }
}
import scala.math._
//import scala Math package to use the PI value 

object SphereVolume{
    def main(args: Array[String]){
       println("\n--------Volume of a Sphere---------\n"); 
       var r: Int = 5;//radius
       var V:  Double= 0;//volume
       V = (4/3)*r*r*r*Pi;
       println("Volume is : "+V);
    }
}
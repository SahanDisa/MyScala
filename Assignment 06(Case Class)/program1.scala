object Solution extends App{
    val p1 = Point(2,3)
    val p2 = Point(3,6)
    val p3 = p1 + p2
    val p4 = p1.move(3,5)
    val p5 = p2.invert()
    val dis = p1.distance(5,4)

   
    println(p1)//print out p1 Point
    println(p2)// print out p2 Point
    print("Question 1 : Add two points")
    println(p3)// addition of p1 + p2
    print("Question 2 : move a point")
    println(p4)// move p1 from x axis by dx and y axis by dy
    print("Question 3 : Get the reverse cordinates")
    println(p5)
    print("Question 4 : Get the distance of two points ")
    println(dis)// print the distance
}

case class Point(a:Int,b:Int){
    def x:Int = a;
    def y:Int = b;
    // Add two points(Q1)
    def +(that:Point) = Point(this.x+that.x,this.y + that.y)
    // move a point to the given destination(Q2)
    def move(dx:Int,dy:Int) = Point(this.x + dx,this.y+dy)
    // measure the euclidian distnace between two points(Q3)
    def distance(dx:Int,dy:Int): Double = scala.math.sqrt(scala.math.pow(this.x - dx, 2) + scala.math.pow(this.y - dy, 2))
    // toggle the x and y values(Q4)
    def invert() = Point(this.y,this.x)
}
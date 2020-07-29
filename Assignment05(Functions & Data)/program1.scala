object solution extends App{
    val r1 = new Rational(3,4);
    val r2 = new Rational(6,7);
    var x = r1.neg;
    var y = r2.neg;
    println(x);
    println(y);
    
}

class Rational(n:Int,d:Int){
    def numer:Int = n/(gcd(n,d));
    def denom:Int = d/gcd(n,d);

    //if the number is 2,it converts to 2/1 by constructor
    def this(n:Int) = this(n,1);
    //get the gcd to simplify the fraction
    private def gcd(a:Int,b:Int):Int= if(b==0) a else gcd(b,a%b);
    //negative 
    def neg = new Rational(-this.numer,this.denom);
    //output
    override def toString = numer + "/" + denom;
}
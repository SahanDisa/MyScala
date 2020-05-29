object prime extends App{
    def prime(p:Int,n:Int = 2):Boolean = n match {
        case x if(x==p) => true
        case x if(GCD(p,x)>1) => false
        case x => prime(p,x+1)
    }
    def GCD(a:Int,b:Int):Int = b match {
        case 0 => a
        case x if(x>a) =>GCD(x,a)
        case _ => GCD(b,a%b)
    }
    println(prime(6));
    println(prime(5));
    println(prime(3));
    println(prime(117));
}
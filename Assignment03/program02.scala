object PrimeSequence extends App{
    def primeSeq(n:Int):Unit={
        var i =2;
        while(i<=n){
            if(prime(i)){
                println(i);
            }
            i = i+1;
        }
    }
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
    primeSeq(10);
    primeSeq(200);
}
object FibonacciSeries extends App{
    def fiboSeq(n:Int):Unit ={
        var x = 0;
       while(x<=n){
           print(fibo(x)+" ");
           x = x+1;
       }
       println();
    }
    //recursive function
    def fibo(x:Int): Int=x match {
        case x if(x==0) => 0
        case x if(x==1) => 1
        case x => fibo(x-1) + fibo(x-2)
    }
    fiboSeq(5);//easy case
    fiboSeq(13);//medium case
    fiboSeq(46);//long case
}
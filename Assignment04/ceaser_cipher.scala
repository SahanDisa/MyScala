object ceaserCipher extends App{
    
    //string alphabet
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    //high order functions for encrypt and decrypt
    val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

    //get absolute value by .abs
    val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key).abs%a.size)

    //map reduce function for cipher
    val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

    var s = "abcdxyz"
    //fewer tests
    val ct=cipher(E,s,5,alphabet)
    val pt=cipher(D,ct,5,alphabet)
    println(ct)// FGHI
    println(pt)// ABCD

    //another unit test
    s = "scala"
    val encrypt = cipher(E,s,3,alphabet)
    val decrypt = cipher(D,encrypt,3,alphabet)
    println(encrypt)// VFDOD
    println(decrypt)//SCALA
}
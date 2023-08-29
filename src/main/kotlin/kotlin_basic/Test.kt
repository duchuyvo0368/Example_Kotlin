package kotlin_basic

import kotlin.math.sqrt

fun sum(a:Int,b:Int):Int{
    return a + b;
}
fun main(){
    val a=3
    val b=6
    val tong= sum(a,b)
    val can=sqrt(sum(tong,tong).toDouble())
    println("can =$can")
}
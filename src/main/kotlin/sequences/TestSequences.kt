package sequences

fun foo(x:Int):Sequence<Int> = sequence {
    for (i in 0..x){
        if (i%2==0){
            yield(i)
        }
    }
}
fun main(){
    foo(10).forEach {
        println(it)
    }
    foo(10).map {
        it*it
    }.forEach {
        println(it)
    }
    //filter
}
package coroutines.element

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//fun main()= runBlocking{
//    val job=GlobalScope.launch {
//        delay(5000)
//        println("Hello")
//    }
//    println("World")
//    job.join()
//    println("Kotlin")
//}

fun main()= runBlocking{
    val job=launch {
        repeat(1000){
            println("Laan thu :"+it)
            delay(500L)
        }

    }
    delay(1000L)
    println("main: I'm tired of waiting!")
    job.cancel()
    println("main: Now I can quit.")
}
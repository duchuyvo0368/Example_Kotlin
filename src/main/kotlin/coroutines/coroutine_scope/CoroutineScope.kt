package coroutines.coroutine_scope

import kotlinx.coroutines.*

fun main()= runBlocking {
    launch {
        delay(200)
        println("hello")
    }
    val number =async {
        "hello2"
    }
    println(number.await())
//    coroutineScope {
//        launch {
//            delay(500)
//            println("hello1")
//        }
//        delay(200)
//        println("Kotlin 1")
//    }
    delay(300)
    println("kotlin")
}
package coroutines.basic

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


fun main(){
    GlobalScope.launch {
        delay(10000)
        println("World")
    }
    println("Hello")
    Thread.sleep(20000L)
    println("Kotlin")
}
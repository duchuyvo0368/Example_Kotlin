package coroutines.async

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main()= runBlocking {
    val time = measureTimeMillis {
        val one= async(start = CoroutineStart.LAZY){ printOne() }
        val tow =async(start = CoroutineStart.LAZY){ printTwo() }
        one.start()
        tow.start()
        println("The answer is ${one.await()+tow.await()}")
    }
    println("Completed in $time ms")
}

private suspend fun printOne(): Int {
    delay(1000L)
    return 10
}

private suspend fun printTwo(): Int {
    delay(1000L)
    return 20
}
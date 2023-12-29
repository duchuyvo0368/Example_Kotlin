package coroutines.async

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main()= runBlocking {
    val time= measureTimeMillis {
        val one=async { printOne() }
        val tow=async { printTow() }
        println("The answer is ${one.await()+tow.await()}")//ham await() co Deferred de tra ve ket qua
    }
    println("Completed in $time ms")
}
private suspend fun printOne():Int{
    delay(1000)
    return 10
}
private suspend fun printTow():Int{
    delay(1000)
    return 20
}
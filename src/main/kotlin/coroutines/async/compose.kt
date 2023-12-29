package coroutines.async

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

fun main()= runBlocking {
    val time= measureTimeMillis {
        val one= printOne()//neu dung launch cho one tow thi tra ve job va khong the + job
        val tow= printTow()
        println("The answer is ${one+tow}")
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
package coroutines.Flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun foo(): Flow<Int> = flow {
    for (i in 0..3) {
        delay(1000)
        emit(i)
    }
}

fun main() = runBlocking {
        launch {
            println(Thread.currentThread().name)
            for (i in 0..3) {
                delay(900)
                println("I'm not blocked $i")
            }
        }

        val time = measureTimeMillis {
            foo().collect { value -> println(value) }
        }
        println(time)
    }
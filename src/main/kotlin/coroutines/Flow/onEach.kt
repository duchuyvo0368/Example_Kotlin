package coroutines.Flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {
    val number = (1..3).asFlow().onEach { delay(3000) }
    val startTime = System.currentTimeMillis()
    number.collect {
        println("number $it")
        println(System.currentTimeMillis()-startTime)
    }

}
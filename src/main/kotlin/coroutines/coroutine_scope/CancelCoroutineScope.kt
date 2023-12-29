package coroutines.coroutine_scope

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val job = launch {
        launch {
            delay(1000)
            println("Job1 :Day la job 1")
        }
        coroutineScope {
            delay(500)
            println("Coroutine 2")
        }
    }
    delay(700)
    job.cancel()
    delay(2000)
    println("main: cancel job")


}
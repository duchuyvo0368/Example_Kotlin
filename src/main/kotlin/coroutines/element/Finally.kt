package coroutines.element

import kotlinx.coroutines.*

/*fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("I'm sleeping $i ...")
                delay(500L)
            }
        } finally {
            // Tranh thủ close resource trong này đi nha :D
            println("I'm running finally")
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancel() // cancels the job
    println("main: Now I can quit.")
}

fun main()= runBlocking {
    val job=launch {
        try {
            repeat(1000){i->
                println("I'm sleeping $i....")
                delay(500L)
            }
        }finally {
            println("I'm running finally")
            delay(1000L)
            println("Print me please!")
        }
    }
    delay(1300L)
    println("main: I'm tired of waiting !")
    job.cancel()
    println("main: Now I can quit")
}
 */
// lam cho coroutines bat tu

fun main()= runBlocking{
    val job=launch {
        try {
            repeat(1000){i->
                println("I'm sleeping  $i...")
                delay(500)

            }
        }finally {
            withContext(NonCancellable){
                println("I'm running  finally")
                delay(1000)
                println("I'm not cancellable")
            }
        }
    }
    delay(1300)
    println("main: I'm tired of waiting...")
    job.cancel()
    println("main: Now I can quit")
}
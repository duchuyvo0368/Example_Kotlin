package coroutines.Flow

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking
import java.util.concurrent.CancellationException

fun number():Flow<Int> = flow {
    try {
        emit(1)
        emit(2)
        println("This line  will not execute")
        emit(3)
    }catch (e: CancellationException){
        println("exception")
    }finally {
        println("close resource here")
    }
}
fun main()= runBlocking {
    number().take(2).collect { println(it) }
}
package coroutines.Flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.runBlocking


//filter loc ra cac gia tri thoa ma va bo qua gia tri khong thoa man
fun main()= runBlocking {
    (1..5).asFlow().filter {
        println("Filter $it")
        it%2==0
    }.collect { println("Collect $it") }
}
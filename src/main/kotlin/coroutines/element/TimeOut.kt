package coroutines.element

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull

//dung withTimeout no se ban ra Exception vi het thoi gian ma chua thuc hien xong
fun main()= runBlocking {
   val result= withTimeoutOrNull(1300){
        repeat(1000){i->
            println("I'm sleeping $i...")
            delay(500)
        }
       "Done"
    }
    println("result: $result")
}
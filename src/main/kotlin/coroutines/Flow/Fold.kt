package coroutines.Flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.fold
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {
    val sum= (1..3).asFlow().fold(initial = 10){a,b->
        println("Tong gia tri tich luy: $a")
        println("Gia tri moi: $b")
        a+b
    }
    println("Tong =$sum")
}
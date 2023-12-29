package coroutines.Flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.runBlocking


//reduce dung tinh tong gia tri cong don phat ra khong can dung collet
//fun main()= runBlocking {
//    val sum =(1..3).asFlow().map { it*it }.reduce { a, b ->
//        a+b
//    }
//    println(sum)
//}

//hoat dong cua reduce
fun main()= runBlocking {
    val sum = listOf("a","b","c","d").asFlow() .reduce { a, b ->
        println("Tong da tich luy $a")
        println("Gia tri moi $b")
        a+b
    }
    println("Tong = $sum")
}
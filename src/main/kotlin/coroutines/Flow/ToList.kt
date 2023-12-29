package coroutines.Flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.flow.toSet
import kotlinx.coroutines.runBlocking

fun main()= runBlocking {
    val list:List<String> = listOf("a","b","c","d","e").asFlow().toList()
    val set:Set<String> = setOf("1","2","3","4","5").asFlow().toSet()
    println(javaClass.)
}
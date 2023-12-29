package coroutines.basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

//mot suspend fun chi goi duoc trong suspend fun khac  vi du(delsy() chi goi trong suspend fun sayHello())

fun sayHello() = runBlocking {
    println("Hello")
    delay(5000)
}

//fun main() {
//    //runBlocking{} chay tuan tu
//    sayHello()
//    println("World")
//}
fun main() = runBlocking<Unit> {
    println("My context is: $coroutineContext")
}

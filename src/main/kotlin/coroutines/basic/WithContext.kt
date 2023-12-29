package coroutines.basic

import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(){
    newSingleThreadContext("thread1").use { ctx1->
        println("cxt1- ${Thread.currentThread().name}")
         newSingleThreadContext("thread2").use { ctx2->
             println("ctx2-${Thread.currentThread().name}")
             runBlocking(ctx1) {
                 //dang chay thread ctx1
                 println("Started in ctx1-${Thread.currentThread().name}")
                 //dung withContext de chuyen Coroutine
                 withContext(ctx2){
                     println("Working in ctx2-${Thread.currentThread().name}")
                 }
                 println("Back to ctx1 -${Thread.currentThread().name}")

             }
         }
        println("out of ctx2 block -${Thread.currentThread().name}")
    }
    println("out of ctx1 block-${Thread.currentThread().name}")
}
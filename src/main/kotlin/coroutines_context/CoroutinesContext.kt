package coroutines_context

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import sun.rmi.runtime.Log

//job:nắm giữ vòng đời coroutines
//corountinesname:đặt tên các coroutines
//Noncancellable:giúp cho coroutines không thể cancell
//Dispatchers:quyết định thread nào chạy trên nó
//Dispatchers.Default:chạy trên backgroundthread(sắp xếp list,đọc json,..)
//Dispatchers.IO:đọc ghi dữ liệu (đọc database,file..)
//Dispatchers.Main:chạy trên mainthread update các ui và livedata
//Dispatchers.Unconfined:
object TestDispatchers{
    fun runMyFirstCoroutines(){
        GlobalScope.launch(Dispatchers.Default) {
            println("Default:${Thread.currentThread().name  }")
        }
        GlobalScope.launch(Dispatchers.IO) {
            println("IO:${Thread.currentThread().name  }")
        }
        //chay tren mainthread
        GlobalScope.launch(Dispatchers.Main) {
            println("Main: ${Thread.currentThread().name  }")
        }
        //Chay tren thraed delay() no chay tren thraed khac
        GlobalScope.launch(Dispatchers.Unconfined) {
            println("Unconfined: ${Thread.currentThread().name  }")
        }
        GlobalScope.launch(newSingleThreadContext("My Thread")) {
            println("run on: ${Thread.currentThread().name  }")
        }
    }
}
fun main(){
    TestDispatchers.runMyFirstCoroutines()
}
package coroutines.kotlinx_coroutines_android

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

//dung de chuyen hoa cac nguon thuc thi thanh
// CoroutineDispatcher(quan ly thuc thi cua coroutines tren cac luong va nguon thuc thi khac nhau)
//Việc này giúp bạn tập trung vào việc viết mã coroutine mà không cần lo lắng về việc quản lý luồng hay nguồn thực thi.


fun main(){
    //tao mot ExecutorServices voi 2 luong thuc thi
    val executor:ExecutorService=Executors.newFixedThreadPool(2)

    //chuyen ExecutorServices thanh CoroutinesDispatcher
}
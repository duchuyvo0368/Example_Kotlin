package kotlin_extension

import kotlin.math.sin

data class SinhVien(val ten: String, val tuoi: Int)

// let là một hàm mở rộng (extension function) trong Kotlin,
// được sử dụng để truy cập một đối tượng một cách an toàn
fun main() {
    val sinhVien: SinhVien= SinhVien("Jon", 20)

    sinhVien.let {
        val name=it.ten
        val age=it.tuoi
        println("${name} năm nay ${age} tuổi")
    }
    println("sinh vien 2 : ${sinhVien.ten} năm nay ${sinhVien.tuoi} tuổi")


    //kiem tra null
     val name:String?=""
     name?.let {
         //neu name khac null thuc hien ma trong nay
     }

    //bien doi tuong
     val listNumber1= listOf(1,2,3,4,5,6)
    //bien doi listNumber2 nhan doi len
     val listNumber2= listNumber1.let {
         it.map { it*2};//output(2, 4, 6, 8, 10, 12)
     }
    println(listNumber2)

    // ket hop nhieu tac vu tren mot doi tuong
    val result =fetchDataFromServer()?.let{
        process("user1")
    }.orEmpty()
    println("Result: $result ")
}

//du lieu tra ve tu may server
fun fetchDataFromServer(): String? {
    return  "Server Data"//thay null thi Result: rong
}
//xu ly du lieu
fun process(data:String):String{
    return "Process $data"
}

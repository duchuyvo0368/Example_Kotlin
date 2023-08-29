package kotlin_extension

fun Int.convertString1():String{
    return this.toString()
}


fun main() {
    println("Nhập số:")
    val number = readlnOrNull()?.toIntOrNull() ?: 0
    val result = number.convertString1()
    println("Kết quả: $result")
}
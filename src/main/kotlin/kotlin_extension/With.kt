package kotlin_extension

data class Person2(val name: String, val age: Int)
//with là một hàm tiện ích trong Kotlin, cho phép chúng ta truy cập các thành phần
// của một đối tượng một cách dễ dàng hơn, bằng cách tránh việc lặp lại tên đối tượng nhiều lần.
fun main() {
    val person = Person2("John", 30)

    val result = with(person) {
        val greeting = "Hello, my name is $name and I'm $age years old."
        val birthYear = 2023 - age
        "I was born in $birthYear. $greeting"
    }

    println(result)
}

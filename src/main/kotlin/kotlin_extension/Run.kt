package kotlin_extension

data class Person3(val name: String, val age: Int)
//Hàm run cho phép chúng ta thực hiện một số thao tác trên một đối tượng và trả về kết quả cuối cùng của các thao tác đó
fun main() {
    val person = Person3("John", 30)

    val result = person.run {
        val greeting = "Hello, my name is $name and I'm $age years old."
        val birthYear = 2023 - age
        "I was born in $birthYear. $greeting"
    }

    println(result)
}

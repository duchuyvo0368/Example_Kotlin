package kotlin_extension

data class Person4(val name: String, val age: Int)
//also là một hàm tiện ích trong Kotlin, cho phép chúng ta thực hiện các thao tác trên một đối tượng và trả về đối tượng đó
fun main() {
    val person = Person4("John", 30).also {
        println("Creating person with name ${it.name} and age ${it.age}")
    }

    println("Person created: $person")
}

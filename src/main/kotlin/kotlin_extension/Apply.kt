package kotlin_extension

data class Person1(var name: String = "", var age: Int = 0)
//apply là một hàm mở rộng (extension function) trong Kotlin,
// cho phép chúng ta thực hiện các thao tác trên một đối tượng và trả về chính đối tượng đó
fun main() {
    //thiết lập thuộc tính
    val person1 = Person1().apply {
        name = "John"
        age = 30
    }

    println("${person1.name} is ${person1.age} years old")

    //cấu hình đối tượng
    val person2=Person1("huy",18)
    person2.apply {
        name="Alicia"
        age=25
    }
    println("person: $person2")

    //khởi tạo đối tượng một cách nhân chóng
     val  person3=Person1().apply {
         this.name="Huy"
         this.age=20

     }
    println("person 3: ten: ${person3.name}--tuoi: ${person3.age}")

    //tranh bien trung gian
    val list1= mutableListOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }
    //khong dung apply
    val list2= mutableListOf<Int>()
    list2.add(1)
    list2.add(2)
    list2.add(3)
    list2.add(4)
    for (list in list1[0]..list2.size){
        println(list)
    }
    fun printList(number: Int){
        println("list $number")
    }
    list1.forEach(::printList)

}
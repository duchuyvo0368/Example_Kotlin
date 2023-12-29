package oop.access_modifier

class Example {
    public var number1: Int = 10//truy cập bất kì đâu
    private val number2: Int = 20//truy cập trong cùng class
    internal val number3: Int = 30
}

open class Example4 {
    protected val number4: Int = 50
}

class Example5 : Example4() {
    fun print(){
        println("number4=${number4}")
    }


}


fun main() {
    val example = Example()
    val number = example.number1
    println("number1=$number")
    // println("number1=$number2")


    val example5=Example5()
    example5.print()

}
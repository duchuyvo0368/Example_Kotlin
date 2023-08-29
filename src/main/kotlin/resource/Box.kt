package resource


class Box<T>(private val item: T) {

    fun getItem(): T {
        return item
    }
}

fun main() {
    val box1: Box<Int> = Box(1)
    val box2: Box<String> = Box("Hello")

    println(box1.getItem()) // output: 1
    println(box2.getItem()) // output: Hello
}

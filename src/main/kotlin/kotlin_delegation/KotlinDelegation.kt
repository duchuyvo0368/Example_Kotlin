package kotlin_delegation

interface Base{
    fun printMessage()
    fun printMessageLine()
}
class BaseImpl(private val x:Int):Base{
    override fun printMessage() {
        println("$x")

    }

    override fun printMessageLine() {
        println("$x")
    }

}
class Derived(b:Base):Base by b{
    override fun printMessage() {
        println("hello")
    }
}
fun main(){
    val b=BaseImpl(10)
    Derived(b).printMessage()
    Derived(b).printMessageLine()
}
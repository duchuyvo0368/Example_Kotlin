package cautrucdulieuvagiaithuat

class Stack(private val size: Int) {
    private var stack:IntArray=IntArray(size)
    private var top=-1

    fun isEmpty():Boolean{
        return top==-1
    }
    fun isFull():Boolean{
        return top==size-1
    }

    fun push(x:Int){
        if (isFull()){
            println("Stack full")
            System.exit(-1)
        }
        println("Insert stack $x")
        stack[++top]=x
    }
    fun  pop():Int{
        if (isEmpty()){
            println("Stack Empty")
            System.exit(-1)
        }
        return stack[--top]
    }
    fun size(): Int {
        return top + 1
    }
    fun printStack(){
        for (i in 0..top){
            print(stack[i])
        }
    }

}
fun main() {
    val stack = Stack(5)

    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.pop()
    println("\nAfter popping out")

    stack.printStack()
}
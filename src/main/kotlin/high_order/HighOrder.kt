package high_order




//su dung than so ham la ham
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

val sum: (Int, Int) -> Int = { a, b -> a + b }


val result1 = calculate(10, 5, sum)//output:15

//su dung lambda expressions
val greeting: () -> Unit = { println("hello") }

val square: (Int) -> Int = { number -> number * number }

val squaresNumber = square(5)//output:25

//su dung inline functions
inline fun executeAndMeasureTime(action:()->Unit){
    val startTime=System.currentTimeMillis()
    action()
    val endTime=System.currentTimeMillis()
    val elapsedTime=endTime-startTime
    println("Execution time: $elapsedTime ms")
}

//Sử dụng function types
typealias Operation = (Int, Int) -> Int

fun performOperation(a: Int, b: Int, operation: Operation): Int {
    return operation(a, b)
}

val multiply: Operation = { x, y -> x * y }

val result = performOperation(5, 3, multiply) // Kết quả: 15


//Sử dụng higher-order function trên lớp
class Calculator {
    fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
        return operation(x, y)
    }
}

val calculator = Calculator()
val result2 = calculator.calculate(10, 5) { a, b -> a - b } // Kết quả: 5

fun main() {
    greeting()
    println(squaresNumber)


    executeAndMeasureTime {
        for (i in 1..100){
            println(i)
        }
    }

    println("Result function types $result1")
    println("Result function types $result2")
}
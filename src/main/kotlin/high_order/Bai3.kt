package high_order

fun performOperation1(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun main() {
    val sum = performOperation1(5, 10) { x, y ->
        x + y
    }
    val difference = performOperation1(20, 7) { x, y ->
        x - y
    }
    println("Sum: $sum, Difference: $difference")
}

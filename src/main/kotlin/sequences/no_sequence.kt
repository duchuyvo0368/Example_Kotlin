package sequences

fun main() {
    val n = 10

    var sum = 0
    for (i in 1..n) {
        if (i % 2 == 1) { // Kiểm tra số lẻ
            val square = i * i
            sum += square
        }
    }

    println("Result without Sequences: $sum")
}

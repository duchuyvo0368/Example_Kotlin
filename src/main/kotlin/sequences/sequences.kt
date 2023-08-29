package sequences

fun main() {
    val numbers = sequenceOf(1, 2, 3, 4, 5)

    val doubledNumbers = numbers.map {
        it * 2
    }

    println(doubledNumbers.toList()) // Kết quả: [2, 4, 6, 8, 10]
}

package sequences

fun main() {
    val n = 10

    val result = generateSequence(1) { it + 2 } // Tạo Sequence chứa các số lẻ
        .takeWhile { it <= n }                // Lấy các số nhỏ hơn hoặc bằng N
        .map { it * it }                      // Bình phương mỗi số
        .sum()                                // Tính tổng

    println("Result using Sequences: $result")
}

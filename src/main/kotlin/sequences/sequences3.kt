package sequences

fun main() {
    val numbers1 = sequenceOf(1, 2, 3, 4, 5)

    //nếu chưa toList() thì nó là : biểu thức của Sequence(Sequence Expression) không chứa dữ liệu đã được tính toán
    val doubledNumbers1 = numbers1.map {
        it * 2
    }

    println("Doubled Numbers (Using Sequence):")
    println(doubledNumbers1.toList()) // Kết quả: [2, 4, 6, 8, 10]


    //không có sequences
    val numbers2 = listOf(1, 2, 3, 4, 5)
    val doubledNumbers2 = numbers2.map {
        it * 2
    }

    println("Doubled Numbers (Without Using Sequence):")
    println(doubledNumbers2) // Kết quả: [2, 4, 6, 8, 10]

}

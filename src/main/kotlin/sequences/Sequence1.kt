package sequences

data class Product(val name: String, val quantity: Int)

fun main() {
    val productList = listOf(
        Product("Product A", 10),
        Product("Product B", 5),
        Product("Product C", 15)
        // ...Thêm nhiều sản phẩm khác
    )

    // Không sử dụng Sequence
    val filteredProductsNormal = productList
        .filter {
            it.quantity > 5
        }
        .map {
            "${it.name} - ${it.quantity} in stock"
        }
        .toList()

    // Sử dụng Sequence
    val productSequence = productList.asSequence()

    val filteredProductsSequence = productSequence
        .filter { it.quantity > 5 }
        .map {
            "${it.name} - ${it.quantity} in stock"
        }
        .toList()

    println("Filtered Products (Normal):")
    filteredProductsNormal.forEach {
        println(it)
    }

    println("\nFiltered Products (Sequence):")
    filteredProductsSequence.forEach {
        println(it)
    }
}

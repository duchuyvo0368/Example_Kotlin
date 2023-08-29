package coroutines_flow.flow
//
//import kotlinx.coroutines.*
//import kotlinx.coroutines.flow.*
//
//data class Product(val name: String)
//
//suspend fun fetchProducts(): List<Product> {
//    delay(1000) // Giả lập thời gian tải
//    return listOf(Product("Product A"), Product("Product B"), Product("Product C"))
//}
//
//fun main() = runBlocking {
//    val productsFlow = flow {
//        val products = fetchProducts()
//        emitAll(products.asFlow())
//    }
//
//    productsFlow.collect { product ->
//        println("Fetched product: ${product.name}")
//    }
//}

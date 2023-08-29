package lambdas


data class Lambda1<T>(
    val square:(T)->Unit
)

fun main(){
    val result =Lambda1<Int>{
        println("hello Lambda $it")
    }
    result.square(5)
}
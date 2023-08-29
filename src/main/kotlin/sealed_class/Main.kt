package sealed_class

fun printResult(resource: Resource<Int>){
    when(resource){
        is Resource.Loading-> println("Loading data")
        is Resource.Success-> println("Data loading ${resource.data}")
        is Resource.Error-> println("Error ${resource.data} vs ${resource.message}")
    }
}
fun main(){
    printResult(resource = Resource.Error(1,"data loading error"))
}
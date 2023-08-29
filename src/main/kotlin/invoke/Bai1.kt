package invoke

//invoke dùng để gọi một đối tượng như method
class Bai1 (val name:String){
    operator fun invoke(message:String){
        println("$name hello $message")
    }
}
fun main(){
    val bai1=Bai1("Huy")
    bai1("huy")
}
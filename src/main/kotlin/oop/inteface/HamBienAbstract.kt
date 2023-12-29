package oop.inteface

abstract class HamBienAbstract {
    // Biến final
    val finalVariable: Int = 42

    // Biến không final
    var nonFinalVariable: String = "Hello"
    // Biến static và hàm static
    companion object {
        const val staticVariable: String = "Static Variable"

        fun staticFunction() {
            println("Static Function")
        }
    }

    // Phương thức trừu tượng
    abstract fun someFunction()
}

class ViDu : HamBienAbstract() {
    override fun someFunction() {
        println("Concrete Example Function")
    }
}

fun main() {
    val viDu = ViDu()

    println("Final Variable: ${viDu.finalVariable}")
    viDu.nonFinalVariable = "New Value"
    println("Non-Final Variable: ${viDu.nonFinalVariable}")

    println("Static Variable: ${HamBienAbstract.staticVariable}")
    HamBienAbstract.staticFunction()

    viDu.someFunction()
}

package operator_overloading

class ComplexNum(val read: Double, val imag: Double) {
    operator fun plus(other: ComplexNum): ComplexNum {
        return ComplexNum(read + other.read, imag + other.imag)
    }

    operator fun minus(other: ComplexNum): ComplexNum {
        return ComplexNum(read - other.read,imag-other.imag)
    }
    operator fun times(other: ComplexNum):ComplexNum{
        return ComplexNum(read*other.read,imag*other.imag)
    }

    override fun toString(): String {
        return "$read+ ${imag}i"
    }
}
fun main() {
    val c1 = ComplexNum(3.0, 4.0)
    val c2 = ComplexNum(2.0, 5.0)

    val sum = c1 + c2
    val difference = c1 - c2
    val product = c1 * c2

    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
}
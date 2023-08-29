package resource

sealed class Vehicle<T>(val data: T? =null) {
    class Car<T>(private val model: T?) : Vehicle<T>(model)
    class Motorcycle<T>(private val make: T?) : Vehicle<T>(make)
    class Bicycle<T>(private val brand: T?) : Vehicle<T>(brand)
}
fun main() {
    val vehicle1: Vehicle<Int> = Vehicle.Car(1)
    val vehicle2: Vehicle<String> = Vehicle.Bicycle("Hello")

    println(vehicle1.data) // output: 1
    println(vehicle2.data) // output: Hello
}

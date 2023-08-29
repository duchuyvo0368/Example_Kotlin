package high_order

sealed class Vehicle<T>(val data: T? = null) {
    class Car<T>(private val model: T?) : Vehicle<T>(model)
    class Motorcycle<T>(private val make: T?) : Vehicle<T>(make)
    class Bicycle<T>(private val brand: T?) : Vehicle<T>(brand)
}

fun printVehicle(b: ((Vehicle<Int>) -> Unit)) {
    val vehicle: Vehicle<Int> = Vehicle.Bicycle(10)
    b(vehicle)
}

fun main() {
    printVehicle { vehicle ->
        when (vehicle) {
            is Vehicle.Car -> println("This is a car with model ${vehicle.data}")
            is Vehicle.Motorcycle -> println("This is a motorcycle with make ${vehicle.data}")
            is Vehicle.Bicycle -> println("This is a bicycle with brand ${vehicle.data}")
        }
    }
}
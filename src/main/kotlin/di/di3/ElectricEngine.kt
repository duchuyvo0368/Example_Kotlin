package di.di3

open class Engine {
    open fun start() {
        println("Engine started")
    }
}

class Car(engineType: String) {
    private val engine: Engine = when (engineType) {
        "Gas" -> {
            GasEngine()
        }
        "Electric" -> {
            ElectricEngine()
        }
        else -> {
            throw IllegalArgumentException("Unknown engine type")
        }
    }

    fun startCar() {
        engine.start()
        println("Car started")
    }
}

class GasEngine : Engine() {
    override fun start() {
        println("Gas engine started")
    }
}

class ElectricEngine : Engine() {
    override fun start() {
        println("Electric engine started")
    }
}

fun main() {
    val gasCar = Car("Gas")
    gasCar.startCar()

    val electricCar = Car("Electric")
    electricCar.startCar()
}


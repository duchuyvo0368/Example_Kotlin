package delegated_properties

import kotlin.reflect.KProperty

class Example {
    var value: String by Delegate()

    override fun toString(): String {
        return "Example(value=$value)"
    }
}

class Delegate {
    private var storedValue: String = "Initial Value"

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("Getting value from Delegate")
        return storedValue
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("Setting value in Delegate")
        storedValue = value
    }
}

fun main() {
    val example = Example()
    println(example)

    example.value = "Hello, World!"
    println(example)

    println("Value: ${example.value}")
}

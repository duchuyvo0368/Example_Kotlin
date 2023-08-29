package oop

class Cat(override val name: String):Animal(name) {
    override fun makeSound() {
        println("hello cat")
    }
}
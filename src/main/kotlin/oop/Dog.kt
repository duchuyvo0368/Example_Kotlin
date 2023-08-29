package oop

class Dog(override val name:String) : Animal(name) {
    override fun makeSound() {
        println("hello dog $name")
    }
}
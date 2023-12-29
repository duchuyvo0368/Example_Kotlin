package oop

class Person{
    private var name:String?=null
    private var age:Int?=null

    constructor(name:String,age:Int){
        this.age=age
        this.name=name
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name?.hashCode() ?: 0
        result = 31 * result + (age ?: 0)
        return result
    }

}
fun main(args: Array<String>) {

    val person=Person("huy",10)
    val person2=Person("huy",10)
    val arePersonsEqual: Boolean = person == person2
    println(arePersonsEqual)

}
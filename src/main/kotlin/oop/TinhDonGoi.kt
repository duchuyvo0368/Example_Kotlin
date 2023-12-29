//package oop
//
//class Student(var name:String, var age:Int) {
//
//
//    fun getName(): String {
//        return name
//    }
//
//
//    fun setName(newName: String) {
//        name = newName
//    }
//
//
//    fun getAge(): Int {
//        return age
//    }
//
//    // Hàm setter cho thuộc tính age
//    fun setAge(newAge: Int) {
//        if (newAge >= 0) {
//            age = newAge
//        } else {
//            println("Age cannot be negative.")
//        }
//    }
//
//    fun displayInfo() {
//        println("Name: $name, Age: $age")
//    }
//}
//
//fun main() {
//
//    val student = Student("John", 20)
//
//
//    student.displayInfo()
//
//
//    student.setName("Jane")
//    student.setAge(25)
//
//    student.displayInfo()
//}

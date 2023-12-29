package oop.array

import java.util.Random

fun main() {
    val r = Random()
    println("nhap so phan tu")
    val n: String = readlnOrNull().toString()
    val number = n.toInt()
    val a = IntArray(number)
    for (i in 0 until number) {
        a[i] = r.nextInt(101)
    }
    for (element in a) {
        print("$element\t")
    }
    println()
    println("Đảo ngược mảng")
    a.reverse()
    for (i in a){
        print("$i\t")
    }
    println()
    println("Săp xep mang tăng dan")
    a.sort()
    for (i in a){
        print("$i\t")
    }
    println()
    println("Tong pham tu mang")
    var sum:Int=0
    for(i in a){
        sum+=i
    }
    print(sum)
    println()

    println("nhap so dau vao")
    val pt1= readlnOrNull()
    val number2= pt1?.toInt()
    for (i in a.indices){
        if (number2==a[i]){
            print("vị trí số: $i")
            break
        }
    }
}
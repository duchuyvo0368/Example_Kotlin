package generics

class Students1<T>(val name:(T)->Unit,val age: (T)->Unit)
class Students2<T>(val name:(T),val age: (T))

fun main(){
    val students1:Students1<String> = Students1({name,-> print("$name--")},{ age-> println(age)})
    students1.name("John")
    students1.age("25")


    val students2:Students2<String> = Students2("huy","12")
    println(students2.name+"--"+students2.age)


    val listName= listOf<String>("huy","hai","hoang")
    val lisAge= listOf<String>("12","15","17")
    val students3:Students2<List<String>> =Students2(listName,lisAge)
    println(students3.name)
    println(students3.age)
}



//T - Type (Kiểu dữ liệu bất kỳ thuộc Wrapper class: String, Integer, Long, Float, …)
//E – Element (phần tử – được sử dụng phổ biến trong Collection Framework)
//K – Key (khóa)
//V – Value (giá trị)
//N – Number (kiểu số: Integer, Double, Float, …)
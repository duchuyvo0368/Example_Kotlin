package delegated_properties

import kotlin.reflect.KProperty

class Example1{
    var p:String by Delegated()
}


class Delegated{
    operator fun getValue(thisRef:Any?,property:KProperty<*>):String{
        return "$thisRef,thank you delegated ${property.name} to me!"
    }
    operator fun setValue(thisRef: Any?,property: KProperty<*>,value:String){
        println("$value has been assigned to ${property.name} in $thisRef")
    }

}
fun main(){
    val e=Example1()
    println(e.p)
    e.p="New"
    println(e.p)
}


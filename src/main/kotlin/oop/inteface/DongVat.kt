package oop.inteface

interface AmThanh {
    fun taoAmThanh()

     fun defaultSound() {
        println("Âm thanh mặc định")
    }
}

interface DongVaAn {
    fun an()
}
abstract class DongVat:DongVaAn{
    override fun an() {
        println("Dong vat dang ăn")
    }
    abstract fun chay()
}


class Meo:AmThanh,DongVaAn{
    override fun taoAmThanh() {
        println("Meo Meo")
    }

    override fun an() {
        println("Meo dang an")
    }

}
class Gau: DongVat() {
    override fun chay() {
        println("Gau dang chay")
    }
}
fun main(){
    val  meo=Meo()
    meo.taoAmThanh()
    meo.an()
    meo.defaultSound()

    val gau=Gau()
    gau.an()
    gau.chay()

}
package oop.abstractclass

abstract class HinhDang {
    //hàm abstract, hàm abstract không có thân hàm
    abstract fun tnhDienTich(): Double//tính diện tích

    fun hienThiTen(tenHinh:String) {
        println("ten hinh:$tenHinh")
    }
}

class HinhTron(var r: Double) : HinhDang() {
    override fun tnhDienTich(): Double {
        return r * r * 3.14
    }

}

class HinhChuNhat(var chieuDai: Double, val chieuRong: Double) : HinhDang() {
    override fun tnhDienTich(): Double {
        return chieuDai * chieuRong
    }
}

fun main() {
    val hinhTron=HinhTron(4.0)
    val dtHinhTron=hinhTron.tnhDienTich()
    println("Dien Tich Hinh Tron: $dtHinhTron")

    val hinhChuNhat=HinhChuNhat(5.0,4.0)
    val dtHinhChuNhat=hinhChuNhat.tnhDienTich()
    println("Dien tich hinh chu nha:$dtHinhChuNhat")
}
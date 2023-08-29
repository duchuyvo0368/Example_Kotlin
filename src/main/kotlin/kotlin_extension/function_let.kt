package kotlin_extension

fun main() {
    // Ví dụ 1: Xử lý đối tượng nullable
    val nullableString: String? = getNullableString()
    nullableString?.let {
        println("Độ dài của chuỗi: ${it.length}")
    }

    // Ví dụ 2: Chuyển đổi kiểu dữ liệu và thực hiện thao tác trên kiểu mới
    val nullableInt: Int? = getNullableInt()
    val nonNullableInt: Int = nullableInt?.let { it } ?: 0
    println("Giá trị của nonNullableInt: $nonNullableInt")

    // Ví dụ 3: Thực hiện hàm lambda chỉ khi đối tượng không phải là null
    val name: String? = getName()
    name?.let { nonNullableName ->
        println("Tên: $nonNullableName")
    }
}

fun getNullableString(): String? {
    return "Hello, Kotlin"
}

fun getNullableInt(): Int? {
    return null
}

fun getName(): String? {
    return "John"
}

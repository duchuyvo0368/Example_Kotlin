package coroutines_flow.flow

import kotlinx.coroutines.*
import kotlin.random.Random

data class User1(val id: Int, val name: String)

fun main() = runBlocking {
    val users = fetchUsers() // Hàm không đồng bộ trả về danh sách người dùng

    // Lọc và in ra người dùng có tên dài hơn 5 ký tự
    val longNameUsers = mutableListOf<User1>()
    for (user in users) {
        if (user.name.length > 5) {
            longNameUsers.add(user)
        }
    }
    println("Users with long names: $longNameUsers")
}
// Chúng ta cần tạo một danh sách tạm thời để lưu trữ các người dùng có tên dài hơn 5 ký tự trước khi in chúng ra màn hình.
suspend fun fetchUsers(): List<User1> {
    delay(2000) // Giả lập việc tải dữ liệu
    return List(10) { User1(it + 1, "User_${Random.nextInt(100)}") }
}

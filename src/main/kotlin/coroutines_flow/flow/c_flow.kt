package coroutines_flow.flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.Random

data class User(val id: Int, val name: String)

fun main() = runBlocking {
    val users = fetchUsersFlow() // Flow phát ra danh sách người dùng

    // Lọc và in ra người dùng có tên dài hơn 5 ký tự
    users
        .filter { it.name.length > 5 }
        .collect { user ->
            println("User with long name: $user")
        }
}
// Chúng ta chỉ cần sử dụng operator filter để lọc ra các người dùng có
// tên dài hơn 5 ký tự và sử dụng collect để in chúng ra màn hình một cách trực tiếp, không cần tạo danh sách tạm thời.
fun fetchUsersFlow(): Flow<User> = flow {
    delay(2000) // Giả lập việc tải dữ liệu
    repeat(10) { index ->
        emit(User(index + 1, "User_${Random.nextInt(100)}"))
    }
}

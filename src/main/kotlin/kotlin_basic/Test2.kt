//package kotlin_basic
//
//
//// Hàm tạo nhiệm vụ đồng bộ để kiểm tra một số nguyên có phải số chẵn hay không
//fun isEvenNumber(number: Int): Task<Boolean> {
//    val source = TaskCompletionSource<Boolean>()
//
//    // Kiểm tra xem số có phải số chẵn hay không
//    val isEven = number % 2 == 0
//
//    // Hoàn tất nhiệm vụ với kết quả isEven
//    source.setResult(isEven)
//
//    return source.task
//}
//
//// Sử dụng hàm isEvenNumber để kiểm tra số và hiển thị kết quả
//fun main() {
//    val numberToCheck = 10
//
//    isEvenNumber(numberToCheck)
//        .addOnSuccessListener { result ->
//            println("Số $numberToCheck là số chẵn: $result")
//        }
//        .addOnFailureListener { exception ->
//            println("Đã xảy ra lỗi: ${exception.message}")
//        }
//}

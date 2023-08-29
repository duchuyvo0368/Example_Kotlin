package passwordstrength

enum class PasswordStrength {
    WEAK,
    MEDIUM,
    STRONG
}

fun isValidPassword(password: String):PasswordStrength{
    val hasUppercase = password.matches(Regex(".*[A-Z].*"))
    val hasDigit = password.matches(Regex(".*\\d.*"))
    val hasSpecialChar = password.matches(Regex(".*[!@#\\\$%^&*()-=_+\\\\[\\\\]{}|;':\\\",./<>?].*"))


    return when {
        password.length < 6 -> PasswordStrength.WEAK
        password.length < 8 && (hasUppercase || hasDigit || hasSpecialChar) -> PasswordStrength.MEDIUM
        password.length >= 8 && (hasUppercase && hasDigit && hasSpecialChar) -> PasswordStrength.STRONG
        else -> PasswordStrength.WEAK
    }
}

fun getDashColor(strength: PasswordStrength): String {
    return when (strength) {
        PasswordStrength.WEAK -> {
            "Thanh view1 "
        }
        PasswordStrength.MEDIUM -> {
           "thanh view 1 và 2"
        }
        PasswordStrength.STRONG -> {
           "ca 3 thanhview"
        }
    }
}

fun main(){
    print("nhập password: ")
    val password= readlnOrNull()
    val strength= isValidPassword(password.toString())
    println(getDashColor(strength))

}
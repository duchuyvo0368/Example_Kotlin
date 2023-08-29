package high_order

fun main(args: Array<String>) {
    showWelcome("VNTALKING") { str: String -> println(str) }
}

fun showWelcome(strWelcome: String, myfunc: (String) -> Unit) {
    print("Welcome to Kotlin tutorial at ")
    myfunc(strWelcome)
}
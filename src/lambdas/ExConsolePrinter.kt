package lambdas

fun main() {
    console { "Placeholder Text" }

    console { Math.PI }
}

fun console(producer: () -> Any) {
    val message = producer().toString()
    val border = "*".repeat(message.length)
    printWithBorder(message, border)
}

fun printWithBorder(message: String, border: String) {
    println(border)
    println(message)
    println(border)
}
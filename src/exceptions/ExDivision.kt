package exceptions

fun main() {
    println(div(10, 3))
}

fun div(n1: Int, n2: Int): Int {
    return try {
        n1 / n2
    } catch (_: ArithmeticException) {
        0
    }
}
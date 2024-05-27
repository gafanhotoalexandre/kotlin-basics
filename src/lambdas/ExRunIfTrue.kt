package lambdas

fun main() {
    val x = 10

    val r = runIfTrue(x > 5) {
        println("Código executado")
        x
    }

    println(r)
}

fun runIfTrue(condition: Boolean, code: () -> Any?): Any? {
    return if (condition) {
        code()
    } else null
}
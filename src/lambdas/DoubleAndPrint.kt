package lambdas

fun main() {
    val doubleAndPrint = { n1: Int ->
        val res = n1 * 2
        println("Na função: $res")
        res
    }

    print("> ")
    println("Chamada: ${doubleAndPrint(readln().toInt())}")
}
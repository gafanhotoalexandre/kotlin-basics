package exceptions

fun main() {

    print("> ")
    val i: Int? = readln().toIntOrNull()

    val d = i?.toDouble() ?: throw IllegalArgumentException()

    println(d)
}
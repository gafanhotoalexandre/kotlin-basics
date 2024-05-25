package lambdas

fun main() {

    val name = "MacARrão"

    val (first, second) = name.partition { it.isUpperCase() }

    println("1 -> $first")
    println("2 -> $second")
}
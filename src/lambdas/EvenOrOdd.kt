package lambdas

fun main() {
    val evenOrOdd: (Int) -> Boolean = { num: Int -> num % 2 == 0 }

    print("> ")
    println(
        if (evenOrOdd(readln().toInt())) {
            "Par"
        } else {
            "Ímpar"
        }
    )
}
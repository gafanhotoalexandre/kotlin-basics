package lambdas

fun main() {
    val sum2 = fun(n1: Int, n2: Int): Int = n1 + n2

    println(sum(10, 5))
    println(sum2(10, 5))

    val sum3: (Int, Int) -> Double = { n1: Int, n2: Int -> (n1 + n2).toDouble() }

    println(sum3(10, 5))
}

fun sum(n1: Int, n2: Int): Int {
    return n1 + n2
}
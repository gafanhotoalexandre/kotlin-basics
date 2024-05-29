package collections

fun main() {
    println(sum(10, 15, 10))

    val nums = intArrayOf(1, 3, 7, 4, 10, 12)

    val res = sum(*nums)
    println(res)
}

//fun sum(n1: Int, n2: Int) = n1 + n2

fun sum(vararg values: Int): Int = values.sum()
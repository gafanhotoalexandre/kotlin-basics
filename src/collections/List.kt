package collections

fun main() {
    val l1 = listOf(1, 2, 3, 4, 5)
    val l2 = emptyList<Int>()
    val l3 = mutableListOf(1, 2, 3, 4)
    val l4 = listOfNotNull(1, 2, null, null, 3, null, 4)

    l3.add(1, 10)
    multiPrintln(l1, l2, l3, l4)
}

fun multiPrintln(vararg values: Any) {
    values.forEach { print("$it ") }
}

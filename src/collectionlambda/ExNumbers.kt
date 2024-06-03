package collectionlambda

fun main() {
    val numbers = listOf(1, 7, 1, 62, 8, 12)

    numbers
        .associateWith { it + 1 }
        .toSortedMap()
        .forEach { (k, v) -> println("$k -> $v") }
}
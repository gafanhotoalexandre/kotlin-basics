package collections

fun main() {
    // red-black tree
    val ascS = sortedSetOf(1, 3, 7, 2, 4, 9, 6, 8, 5, 0)
    val descS = sortedSetOf(
        Comparator.reverseOrder(),
        1, 3, 7, 2, 4, 9, 6, 8, 5, 0
    )

    println(ascS)
    println(descS)

    val dogs = sortedSetOf(
        Comparator.comparing { it: Dog -> it.name }.reversed(),
        Dog("Evandro"),
        Dog("Osvaldo"),
        Dog("Djalma"),
        Dog("Maurício"),
    )
    println(dogs)
    dogs.forEach { print("${it.name} ") }
}
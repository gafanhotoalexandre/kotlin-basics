package collectionlambda

fun main() {
    val names =
        Person
            .data()
            .map { it.name }
    names
        .shuffled()
        .take(3)
        .forEach { print("|$it ") }

    println("\nRandom name: ${names.randomOrNull()}")
}
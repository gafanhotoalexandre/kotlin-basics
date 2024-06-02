package collectionlambda

fun main() {
    val names =
        Person
            .data()
            .joinToString(" - ") { it.name }

    println(names)
}
package collectionlambda

fun main() {
    val count =
        Person
            .data()
            .count { it.name.uppercase().startsWith("A") }

    println(count)
}
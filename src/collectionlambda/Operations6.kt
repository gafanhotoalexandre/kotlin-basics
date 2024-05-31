package collectionlambda

fun main() {
    val countFilteredAges =
        Person.data()
            .filter { it.name.uppercase().startsWith("R") }
            .sumOf { it.age }

    println(countFilteredAges)
}
package collectionlambda

fun main() {
    val sumAges =
        Person.data()
            .map { it.age }
            .reduce { acc, age -> acc + age }

    println("Idades somadas com reduce: " + sumAges)
}
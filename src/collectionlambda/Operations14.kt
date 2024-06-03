package collectionlambda

fun main() {
    val data =
        Person
            .data()

    data
        .groupBy { it.name[0] }
        .forEach { (key, value) -> println("$key -> $value") }

    data
        .groupBy({ it.name[0] }, { it.name }) // (indice de agrupamento, valor do agrupamento)
        .forEach { (key, value) -> println("$key -> $value") }
}
package collectionlambda

fun main() {
    Person
        .data()
        .groupingBy { it.name[0] }
        .eachCount()
        .forEach { (k, v) -> println("$k -> $v") }
}
package collectionlambda

fun main() {
    Person
        .data()
        .associate { it.name to it.age }
        .forEach { (name, age) -> println("Mapa: $name -> $age") }
}
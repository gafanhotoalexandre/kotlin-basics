package collectionlambda

fun main() {
    Person
        .data()
        .associateBy { it.name }
        .forEach { (name, obj) -> println("$name -> $obj") }
}
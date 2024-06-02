package collectionlambda

fun main() {
    val data = Person.data()

    val maxName = data
        .maxBy { it.name  }
        //.maxOf { it.name }
    println(maxName)

    val minAge = data.minOf { it.age }
    println(minAge)
}
package collectionlambda

fun main() {
    val ageExists =
        Person
            .data()
            .none { it.age <= 99 }
//            .all { it.age <= 99 }
//            .any { it.age <= 99 }

    println(ageExists)
}
package collectionlambda

fun main() {
    val age =
        Person
            .data()
            .first { it.name == "Roberto" }
            .age
//            .firstOrNull { it.name == "Roberto" }
//            ?.age ?: 0
    println(age)
//    val age =
//        Person
//            .data()
//            .find { it.name == "Gustavo" }
//            ?.age ?: 0
//
//    println(age)
}
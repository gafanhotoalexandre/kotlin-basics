package collectionlambda

fun main() {
    Person
        .data()
        .filter { it.age <= 25 }
        .sortedBy { it.age }
        .forEachIndexed { index, p -> println("${index + 1} -> $p") }

//    val people = Person.data()
//    val filteredPeople = people.filter { it.age < 15 }
//
//    multiPrintln(people, filteredPeople)
}

//fun multiPrintln(vararg values: Any) {
//    values.forEach { println(it) }
//}
package more_classes

fun main() {
    val p1 = Person("André", "Piolho", 37)
    val p2 = Person("André", "Piolho", 37)
    val p3 = p2.copy(age = 22)

    println(p1)
    println(p3)
    println(p1 == p3)
}

data class Person (
    val firstName: String,
    val lastName: String,
    val age: Int
)
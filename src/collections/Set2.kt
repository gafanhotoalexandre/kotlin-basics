package collections

//import java.util.Objects

fun main() {
    val dogs = setOf(
        Dog("Evandro"),
        Dog("Osvaldo"),
        Dog("Osvaldo"),
        Dog("Djalma"),
        Dog("Maurício"),
        Dog("Maurício"),
    )

    println(dogs)
}

data class Dog(private val name: String) {
    override fun toString() = "Dog(name=$name, hashCode=${hashCode()})"

//    override fun hashCode(): Int {
//        return Objects.hash(name)
//    }
//
//    override fun equals(other: Any?): Boolean {
//        return if (other is Dog) {
//            this.name == other.name
//        } else false
//    }
}
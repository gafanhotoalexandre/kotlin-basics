package collections

fun main() {
    val map1 = mapOf(1 to "A", 2 to "B", 3 to "C")

    map1.forEach { (key, value) ->
        println("$key ---> $value")
    }

    map1.keys.forEach { print("$it ") }
    map1.values.forEach { print("$it ") }

}
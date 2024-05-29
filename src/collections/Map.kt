package collections

fun main() {
    val map1 = mapOf(
        1 to "A",
        2 to "B"
    )
    println(map1)

    val v1 = map1[1]
    println(v1)

    val map2 = map1.toMutableMap()

    map2[3] = "C"
    println(map2)
}
package ooadvanced

fun main() {
    val p1 = Point(10, 5)
    val p2 = Point(5, 3)
    val p3 = p1 + p2
    val p4 = p2 - p3
    val p5 = p1 * 25

    superPrint(p1, p2, p3, p4, p5)
}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) = Point(x = x + other.x, y =  y + other.y)

    operator fun minus(other: Point) = Point(x = x - other.x, y =  y - other.y)

    operator fun times(multiplier: Int) = Point(x = x * multiplier, y = y * multiplier)
}

fun superPrint(vararg values: Any) = values.forEach { println(it) }

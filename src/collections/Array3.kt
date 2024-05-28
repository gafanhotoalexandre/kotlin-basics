package collections

fun main() {
    val circles = arrayOf(
        Circle(1.0),
        Circle(3.0),
        Circle(6.0)
    )

    repeat(circles.size) {
        println(circles[it].surface())
    }

    println()

    for (element in circles) {
        println(element.surface())
    }

    println()

    println("ForEach")
    circles.forEach { println(it.surface()) }
}

class Circle(private val radius: Double) {
    fun surface() = Math.PI * radius * radius
}
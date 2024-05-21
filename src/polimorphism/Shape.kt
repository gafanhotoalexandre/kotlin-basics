package polimorphism

fun main() {
    val sq = Square()
    println(sq.vertexNumber)

    val tr = Triangle()
    println(tr.vertexNumber)
}

abstract class Shape {
    open val vertexNumber: Int = 0
}

class Square : Shape() {
    override val vertexNumber: Int = 4
}

class Triangle(
    override val vertexNumber: Int = 3
) : Shape() {
}
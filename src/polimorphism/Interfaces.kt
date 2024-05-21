package polimorphism

fun main() {
    val tree = Tree("Marrom", 1.5)

    val t2 = tree.clone()
    println(tree)
    println(t2)
}

interface Cloneable {
    fun clone(): Cloneable
}

data class Tree(
    val color: String,
    val height: Double
) : Cloneable {
    override fun clone(): Tree {
        return Tree(color, height)
    }
}
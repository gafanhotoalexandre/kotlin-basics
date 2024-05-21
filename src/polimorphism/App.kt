package polimorphism

fun main() {
    val c = Coffee()

    c.prepare()
}

open class Drink {
    open fun prepare() {
        println("Preparando Drink")
    }
}

class Coffee : Drink() {
    override fun prepare() {
        super.prepare()
        println("Preparando café...")
    }
}
package classes

fun main() {
    val p1 = Person(200)

    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()

    p1.drinkWater()
    p1.walk()

    println(p1.end())
}

private class Person(
    private val capacity: Int = 500
) {

    private var distanceToWater: Int = capacity
    private var distance = 0

    fun walk() {
        if (distanceToWater <= 0) {
            println("Preciso beber água para continuar...")
            return
        }
        distance += 100
        distanceToWater -= 100
    }

    fun drinkWater() {
        println("Bebendo...")
        this.distanceToWater = capacity
    }

    fun end(): Int {
        return distance
    }
}
package polimorphism

fun main() {
    val car = object : Vehicle {
        override fun drive() {
            println("Dirigindo..")
        }
    }

    car.drive()
}

interface Vehicle {
    fun drive()
}
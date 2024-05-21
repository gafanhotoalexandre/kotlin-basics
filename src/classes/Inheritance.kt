package classes

fun main() {
    val dog = Dog("caramelo")
    val cat = Cat("cinza")

    println(dog.toString())
    println(cat.toString())
}

abstract class Animal(
    val color: String
) {
    fun eat() {
        println("Comendo...")
    }

    protected fun sleep() {
        println("Dormindo...")
    }
}

class Dog(color: String): Animal(color) {
    fun bark() {
        println("au au..")
    }
}

class Cat(color: String) : Animal(color) {
    fun miau() {
        println("miau..")
    }
}
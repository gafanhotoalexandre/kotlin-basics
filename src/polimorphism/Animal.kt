package polimorphism

fun main() {
    val d1: Animal = Dog()
    d1.eat()

    if (d1 is Dog) d1.run()
}

abstract class Animal {
    fun eat() {
        println("Comendo...")
    }
}

class Dog : Animal() {
    fun run() {
        println("Correndo...")
    }
}

class Cat : Animal() {
    fun sleep() {
        println("Dormindo...")
    }
}
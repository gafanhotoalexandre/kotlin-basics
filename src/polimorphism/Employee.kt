package polimorphism

fun main() {
    val p = Programmer()
    p.work()

    val kp = KotlinProgrammer()
    kp.work()

    var newKp: Programmer = AndroidKotlinProgrammer()
    newKp.work()
}

abstract class Employee {

    abstract fun work()
}

open class Programmer : Employee() {
    override fun work() {
        println("Programador trabalhando...")
    }
}

open class KotlinProgrammer : Programmer() {
    override fun work() {
        println("Programador Kotlin trabalhando...")
    }
}
class AndroidKotlinProgrammer : KotlinProgrammer() {
    override fun work() {
        println("AKP trabalhando... ")
    }
}

class Teacher : Employee() {
    override fun work() {
        println("Professor trabalhando...")
    }
}
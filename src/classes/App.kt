package classes

fun main() {
    val a1 = Account("1234-1", "Jorge")
    val a2 = Account("4445-5", "Teresa")

    val a3 = Account()
    val a4 = Account("4321-4", "Lucia", 10_000.00)

    a1.deposit(2000.0)
    a2.deposit(150.0)

    a1.printInfo()
    a2.printInfo()
    a3.printInfo()
    a4.printInfo()

}
package polimorphism

fun main() {
    val account = Account(PersonName("Alexandre", "Martins"))

    account.deposit(2000.0)
    account.print()
}

data class Account(val owner: Nameable): Printable {
    private var balance: Double = 0.0

    fun deposit(value: Double) {
        balance += value
    }

    override fun print() {
        println("Saldo de ${owner.fullName}: R$$balance")
    }
}

class PersonName(
    override val firstName: String,
    override val lastName: String
): Nameable {}

interface Nameable {
    val firstName: String
    val lastName: String
    val fullName: String
        get() = "$firstName $lastName"
}

interface Printable {
    fun print()
}
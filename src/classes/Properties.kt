package classes

fun main() {
    val ac = UserAccount(100.0)
    ac.deposit(100.0)
    ac.withdraw(100.0)
    ac.withdraw(100.0)
    ac.withdraw(100.0 )
    println(ac.balance)
}

class UserAccount (
    balance: Double = 0.0
) {
    init {
        require(balance >= 0)
    }

    var balance: Double = balance
        private set

    fun deposit(amount: Double) {
        require(amount >= 0)

        balance += amount
    }

    fun withdraw(amount: Double) {
        require(amount >= 0)

        balance -= amount
    }
}
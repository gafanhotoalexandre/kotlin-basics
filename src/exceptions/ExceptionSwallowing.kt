package exceptions

fun main() {
    val bAccount = BankAccount()
    try {
        bAccount.deposit(300.0)
        bAccount.withdraw(500.0)
    } catch (e: Exception) {} // não faça isso!

    println(bAccount.balance)
}
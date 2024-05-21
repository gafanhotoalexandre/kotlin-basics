package classes

class Account(
    val accountNumber: String,
    val accountOwner: String
) {

    private var balance: Double = 0.0

    constructor(): this(accountNumber = "", accountOwner = "") {
        println("constructor()")
    }

    constructor(
        accountNumber: String,
        accountOwner: String,
        balance: Double
    ): this(accountNumber = accountNumber, accountOwner= accountOwner) {
        this.balance = balance
    }

    fun deposit(amount: Double) {
        balance += amount
    }

    fun deposit(amount: Int) {
        balance += amount
    }

    fun printInfo() {
        println("Number: $accountNumber; Owner: $accountOwner; Balance: $balance")
    }
}
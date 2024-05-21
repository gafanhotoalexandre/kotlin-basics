package exceptions

class InsufficientFundsException(private val currentBalance: Double) : RuntimeException() {
    override val message = "Há apenas $currentBalance em conta."
}
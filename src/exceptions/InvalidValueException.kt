package exceptions

class InvalidValueException(
    private val value: Double
) : RuntimeException() {
    override val message = "O valor $value não é válido."
}
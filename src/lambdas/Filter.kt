package lambdas

fun main() {
    val s1 = "aB3dE5FgH6IjKlMnaB3dE5FgH6IjKlMn"

    val s2 = s1.filter { it.isDigit() }
    val s3 = s1.filter { it.isLetter() }

    println(s2)
    println(s3)
}
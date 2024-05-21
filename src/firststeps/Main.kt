package firststeps

fun main() {

    println(spacing("Olá, meu amigo.", false))

}

private fun spacing(str: String, uppercase: Boolean = false): String {
    val sb = StringBuilder()

    for (c in str) {
        sb.append("$c ")
    }

    val s = sb.toString().trim()

    return if (uppercase) {
        s.uppercase()
    } else {
        s
    }
}

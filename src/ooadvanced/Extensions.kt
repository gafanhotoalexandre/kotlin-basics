package ooadvanced

fun String.hide(): String {
    return "".padEnd(length, '*')
}

val String.size
    get() = length
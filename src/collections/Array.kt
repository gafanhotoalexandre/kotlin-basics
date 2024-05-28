package collections

fun main() {
//    val arr = Array(5) { "*" }
    val arr = arrayOf("*", "*", "*", "*")

    arr[0] = "A"
    arr[3] = "B"
//    arr[30] = "Bold"

    println("Array size: ${arr.size} -> ${arr.contentToString()}")
    println("Index ${arr.indexOf("B")} -> ${arr[arr.indexOf("B")]}")
}
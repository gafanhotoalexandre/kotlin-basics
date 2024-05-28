package collections

fun main() {
    val arr1 = arrayOf("A", null, "C")
    val arr2 = arrayOfNulls<String>(5)
    val arr3 = intArrayOf(1, 2, 3)

    println(arr1.contentToString())
    println(arr2.contentToString())
    println(arr3.contentToString())
}
package collectionlambda

fun main() {
    val products = mapOf(
        "Alface" to 2.5,
        "Arroz" to 6.9,
        "Banana" to 4.8,
        "Sal" to 2.4
    )

    // R1
    val maxPrice = products.maxBy { it.value }.value
    println(maxPrice)

    // R2
    val minPriceProduct = products.minBy { it.value }.key
    println(minPriceProduct)

    // R3
    val cheapProducts = products.filter { (_, value) -> value < 5.0 }.keys
    println(cheapProducts)
}
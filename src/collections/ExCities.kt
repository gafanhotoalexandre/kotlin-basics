package collections

fun main() {
    val cities = listOf("Londres", "Paris", "Lisboa", "Londres", "Roma", "Roma", "Berlim", "Madri", "Lisboa")

    val trips = cities.size
    val numberOfCities = cities.toSet().size

    print("Foram $trips viagens e eu visitei ")
    println("$numberOfCities cidades diferentes.")
}
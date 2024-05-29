package collections

import java.util.Comparator

fun main() {
    val countries = mapOf(
            55 to "Brazil",
            351 to "Portugal",
            54 to "Argentina",
            1 to "United States"
        )
        .values
        .toSortedSet(Comparator.reverseOrder())
        .toMutableList()
    println(countries)
//    val phoneCodes = mapOf(
//        55 to "Brazil",
//        351 to "Portugal",
//        54 to "Argentina",
//        1 to "United States"
//    )
//
//    val mutCountries = phoneCodes.values.toSortedSet(Comparator.reverseOrder())
//
//    val orderedCountries = mutCountries.toMutableList()
//
//    println(orderedCountries)
}
package enums

fun main() {
    val yearMonth = Month.DECEMBER

    println(yearMonth)
    println(yearMonth.name)
    println(yearMonth.ordinal)

    val nextMonth = yearMonth.next().next()
    println(nextMonth)

    println(Month.getEnumByNumberOfMonth(11))
    println(Month.valueOf("AUGUST"))
}

enum class Month(
    private val numberOfMonth: Int
) {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    fun next(): Month {
        return entries
                .find { it.numberOfMonth == numberOfMonth + 1 }
                ?: JANUARY
    }

    companion object {
        fun getEnumByNumberOfMonth(numberOfMonth: Int): Month {
            return entries
                    .first { it.numberOfMonth == numberOfMonth }
        }
    }
}
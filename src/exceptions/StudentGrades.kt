package exceptions

fun main() {
    try {
    val grades = StudentGrades()
        .add(-10.0)
        .add(10.0)
        .add(15.0)

        println(grades.average())
    } catch (e: RuntimeException) {
        println(e.message)
        e.printStackTrace()
    }

}

class StudentGrades {
    private var sum: Double = 0.0
    private var numberOfGrades: Int = 0

    fun add(grade: Double): StudentGrades {
//         if (grade !in 0.0..10.0) {
//             throw IllegalArgumentException("Nota inválida.")
//         }
        require(grade in 0.0..10.0) { "A nota $grade é inválida..." }

        sum += grade
        numberOfGrades++
        return this
    }

    fun average(): Double {
        return sum / numberOfGrades
    }
}
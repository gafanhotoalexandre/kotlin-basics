package organization

typealias ExecutorID = String
typealias CodeToExecute = (ExecutorID) -> String

fun main() {
    println(Executor("A").execute { word -> word.repeat(3) })
}

class Executor(private val id: ExecutorID) {
    fun execute(code: CodeToExecute): String {
        return code(id)
    }
}
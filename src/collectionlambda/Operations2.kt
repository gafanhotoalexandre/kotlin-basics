package collectionlambda

fun main() {
    val names = Person.data().map { it.name }
    println(names.mapIndexed { index, it ->
        print("$it ")
        index+1
    })
}
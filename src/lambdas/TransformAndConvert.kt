package lambdas

fun main() {
    val res = transformAndConvert(
        "$",
        "|",
        100,
        transformation = { v -> v * v }
    )

    val negative = transformAndConvert(
        "$",
        "|",
        150,
    ) { v -> -v}

    println(res)
    println(negative)
}

fun transformAndConvert(
    prefix: String,
    sufix: String,
    value: Int,
    transformation: (Int) -> Int
): String {
    val transformedValue = transformation(value)
    return "$prefix$transformedValue$sufix"
}
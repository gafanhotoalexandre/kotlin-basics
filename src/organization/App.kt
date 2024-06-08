package organization

import organization.p1.Counter
import organization.p2.Counter as CounterDecrement

fun main() {
    println("Hello")

    val c = Counter()
    c.increment()
    println(c)

    val c2 = CounterDecrement()
    c2.decrement()
    println(c2)
}
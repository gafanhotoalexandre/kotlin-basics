package organization.p1

class Counter() {
    private var counter: Int = 0

    fun increment() {
        counter++
    }

    override fun toString(): String {
        return counter.toString()
    }
}
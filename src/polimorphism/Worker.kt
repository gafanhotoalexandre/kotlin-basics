package polimorphism

var totalPay = 0.0
fun main() {
    val w1 = HourlyWorker(100.0, 160)
    val w2 = FreelancerWorker(5000.0)

    pay(w1)
    pay(w2)
    println(totalPay)
}

fun pay(worker: Worker) {
    totalPay += worker.pay()
}

abstract class Worker(private val baseSalary: Double) {
    fun pay(): Double {
        return baseSalary * multiplier()
    }

    abstract fun multiplier(): Double
}

class HourlyWorker(
    hourPrice: Double,
    private val hoursWorked: Int
) : Worker(hourPrice) {
    override fun multiplier(): Double {
        return hoursWorked.toDouble()
    }
}

class FreelancerWorker(
    private val totalSalary: Double
) : Worker(totalSalary) {
    override fun multiplier(): Double {
        return 1.0
    }
}
package more_classes

fun main() {
    val tv = TV()
    val sp = Smartphone()

    tv.on()
    println("TV ligada?: ${tv.isOn}")
    println("Smartphone ligado?: ${sp.isOn}")
}

abstract class Device {
    var isOn = false
        private set

    fun on() {
        isOn = true
    }

    fun off() {
        isOn = false
    }
}

class TV : Device() {}
class Smartphone : Device() {}
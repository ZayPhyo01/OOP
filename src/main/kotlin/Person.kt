package encapsulation

import encapsulation.car.Car


fun main() {
    val person = Person("Jupitar", 20)
    person.openCarKey()
    person.drive(20)
}

class Person(name: String, age: Int) {
    private var name: String
    private var age: Int
    private val waterBottle: WaterBottle = WaterBottle()
    private val potatePack: PotatoPack = PotatoPack()
    private val car = Car()

    init {
        this.name = name
        this.age = age
    }

    // yes
    fun drinkWater() {
        waterBottle.takeWater()
    }

    // yes
    fun eatPotatoChip() {
        potatePack.takeChip()
    }

    // yes
    fun openBackpackZip() {

    }

    // yes
    fun closeBackPackZip() {

    }

    // no
    fun beepSpeedometer() {

    }


    //yes
    fun openCarKey() {
        car.openCarKey()
    }

    //yes
    fun closeCarKey() {
        car.closeCarKey()
    }


    //yes
    fun drive(speed: Int) {

    }

    //yes
    fun stop() {

    }
}
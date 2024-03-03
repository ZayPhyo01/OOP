package encapsulation

import BackPack
import WaterBottle
import encapsulation.car.Car


fun main() {
    val person = Person("Jupitar", 20)
    person.openCarKey()
}

//person has a backpack
//backpack has a waterB and potatoPack
class Person(name: String, age: Int) {
    private var name: String
    private var age: Int
    private val backPack = BackPack()
    private val car = Car()

    init {
        this.name = name
        this.age = age
    }

    // yes
    fun drinkWater() {
        val waterBottle: WaterBottle? = backPack.takeWaterBottle()
        waterBottle?.takeWater()
    }

    // yes
    fun eatPotatoChip() {
        val potatoPack: PotatoPack? = backPack.takePotatoPack()
        potatoPack?.takeChip()
    }

    // yes
    fun openBackpackZip() {
        backPack.openBackpackZip()
    }

    // yes
    fun closeBackPackZip() {
        backPack.closeBackPackZip()
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
    fun drive() {
        car.drive(40)
    }

    //yes
    //person stop car , car stop -> break stop
    fun stop() {
        car.stop()
    }
}
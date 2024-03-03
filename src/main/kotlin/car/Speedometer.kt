package encapsulation.car



class Speedometer {

    private var LIMITED_SPEED = 60

    fun beep () {
        println("Beep! Beep! , your speed is over limit")
    }

    fun isSpeedLimitOver (speed : Int) = speed > LIMITED_SPEED

}
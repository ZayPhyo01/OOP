package encapsulation.car

class Car {

    private var speed = 0
    private var isCarKeyOpen = false

    fun openCarKey() {
        isCarKeyOpen = true
        println("key is open")
    }

    fun closeCarKey() {
        isCarKeyOpen = false
        println("key is close")
    }

    fun drive(speed: Int) {
        if (speed > 0 && isCarKeyOpen) {
            if (speed > LIMITED_SPEED) {
                beepSpeedometer()
            } else {
                this.speed = speed
                println("Car is driving with speed $speed")
            }
        }
        if (!isCarKeyOpen) {
            println("Sorry , U do need to open key")
        }
    }

    //yes
    fun stop() {
        while (speed > 0) {
            speed--
        }
        breakLifetime -= 10
    }
}
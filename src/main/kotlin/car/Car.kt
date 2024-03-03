package encapsulation.car




class Car {

    private var speed = 0
    private var isCarKeyOpen = false
    private val speedoMeter: Speedometer = Speedometer()
    private val carBreak: Break = Break()

    fun openCarKey() {
        isCarKeyOpen = true
        println("key is open")
    }

    fun closeCarKey() {
        isCarKeyOpen = false
        println("key is close")
    }

    fun drive(speed: Int) {
        //same level
        //car ready to drive
        //speed > 0 and key open
        //drive
        //speed over or not
        //beep

        if (isReadyToDrive()) {
            if (speedoMeter.isSpeedLimitOver(speed)) {
                speedoMeter.beep()
            } else {
                this.speed = speed
                println("Car is driving with speed $speed")
            }
        }
        if (!isCarKeyOpen) {
            println("Sorry , U do need to open key")
        }
    }

    //detail
    private fun isReadyToDrive() = speed > 0 && isCarKeyOpen

    //yes
    fun stop() {
        carBreak.stop(
            speed , onUpdateSpeed = {
                speed = it
            }
        )
    }
}
//car  has a  break

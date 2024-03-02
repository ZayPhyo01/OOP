package encapsulation.car

class Break {

    private var breakLifetime = 100


    fun stop(speed: Int, onUpdateSpeed: (Int) -> Unit) {
        //speed = 80
        //79 , 78 , ... 30..20..10 ..0
        var speedHolder = speed
        while (speedHolder > 0) {
            onUpdateSpeed(speedHolder--)
        }
        breakLifetime -= 10
    }
}
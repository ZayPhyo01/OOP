package encapsulation

class PotatoPack {
    private var potatoChip = 50

    fun takeChip() {
        if (potatoChip > 0) {
            potatoChip--
        }
        println("I ate potato chip , now i have $potatoChip chips")
    }
}
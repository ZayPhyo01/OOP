package encapsulation

import food.Potato

class PotatoPack {
    private var potatoChip = 50
    private val potato = Potato(
        "sweet", 30
    )

    fun takeChip() {
        if (potatoChip > 0) {
            potatoChip--
        }
        println("I ate potato chip , now i have $potatoChip chips")
    }
}
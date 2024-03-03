import food.Water




class WaterBottle {
    private var waterLevel = 100
    private val water = Water(isHotWater = true)
    fun takeWater() {
        waterLevel--
    }
}
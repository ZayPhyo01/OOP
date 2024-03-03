import encapsulation.PotatoPack


class BackPack {
    private var isBagPackZipOpen = false
    private val waterBottle = WaterBottle()
    private val potatePack = PotatoPack()


    fun openBackpackZip() {
        isBagPackZipOpen = true
    }

    // yes
    fun closeBackPackZip() {
        isBagPackZipOpen = false
    }

    fun takePotatoPack(): PotatoPack? {
        if (isBagPackZipOpen)
            return potatePack
        else return null
    }

    fun takeWaterBottle(): WaterBottle? {
        if (isBagPackZipOpen)
            return waterBottle
        else return null
    }
}
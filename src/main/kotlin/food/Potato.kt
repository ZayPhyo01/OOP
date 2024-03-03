package food

data class Potato(
    private val taste: String,
    private val size: Int
)

fun main() {
    val potato1 = Potato(
        "taste",
        100
    )
    val potato2 = Potato(
        "taste",
        100
    )

    println(potato1 == potato2)
    println(potato1)

}




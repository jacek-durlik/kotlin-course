package pl.anril

enum class Seasons {
    SPRING, SUMMER, AUTUMN, WINTER
}

fun main(args: Array<String>) {
    val num = (100..700).step(100)
    num.forEach { when(it) {
        200 -> println("two hundred")
        300 -> println("three hundred")
        400 -> println("four hundred")
        500,600 -> println("five or six hundred")
        else -> println("something else")
    }}

    val season = Seasons.SPRING
    println(when(season) {
        Seasons.WINTER -> "It's cold"
        Seasons.SPRING -> "Plants start to grow"
        Seasons.SUMMER -> "It's hot AF"
        Seasons.AUTUMN -> "Leaves fall from the trees"
    })

    val num1 = 20
    val num2 = 50
    println(when {
        num1 > num2 -> "num1 is greater than num2"
        num1 < num2 -> "num1 is smaller than num2"
        num1 == num2 -> "num1 is equal to num2"
        else -> "You have massively fucked up"
    })
}
package pl.anril

fun main(args: Array<String>) {

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    stepThree.forEach { println(it) }

    val backRange = 5.downTo(1)
    println(5 in backRange)

    (1..57).forEach {
        println(when {
            it % 12 == 0 -> "ProfitSoftware"
            it % 3 == 0 -> "Profit"
            it % 4 == 0 -> "Software"
            else -> it
        })
    }

    (20 downTo 10 step 2).forEach { println("it=$it") }

    val seasons = arrayOf("spring", "summer", "autumn", "winter")
    seasons.forEachIndexed { index, it -> println("season index $index = $it") }

    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                    break@jloop
                }
            }
        }
    }
}
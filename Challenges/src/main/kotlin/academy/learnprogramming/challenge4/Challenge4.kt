package academy.learnprogramming.challenge4

fun main() {
//    (5..5000 step 5).forEach { println(it) }
//    (-500..0).forEach{ println(it)}

    (1..15).forEach {
        println(
            when (it) {
                1 -> 0
                2 -> 1
                else -> {
                    var ret = 0
                    var x1 = 0
                    var x2 = 1
                    for (i in 1 until it) {
                        ret = x1 + x2
                        x1 = x2
                        x2 = ret
                    }
                    ret
                }
            }
        )
    }

    println("---------------------")
    for (i in 1..5) {
        println(i)
        if (i == 2) {
            break
        }
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    break
                }
            }
            if (j == 11) {
                break
            }
        }
    }

    println("---------------------")

    val num = 666
    val dnum = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    }
    println("dnum = $dnum")
}

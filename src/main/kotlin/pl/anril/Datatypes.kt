package pl.anril

import java.lang.NumberFormatException
import java.math.BigDecimal

fun main(args: Array<String>) {
    val myInt = 8
    val myLong = 22L
    val myBoolean = true
    val anything: Any

    println(Test.isVacationTime(myBoolean))

    val names = Array(57) {it+1}
    names.forEach {
        when {
            it % 12 == 0 -> {
                println("ProfitSoftware")
            }
            it % 3 == 0 -> {
                println("Profit")
            }
            it % 4 == 0 -> {
                println("Software")
            }
            else -> {
                println(it)
            }
        }
    }

    val intArray = intArrayOf(1, 2, 4, 6, 9)

    val intArray2 = intArray.toTypedArray()

    Test.printArray(intArray)

    val mixedArray = arrayOf("hello", 2, BigDecimal(3), 45.67)
}
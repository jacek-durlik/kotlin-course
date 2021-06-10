package pl.anril

import java.math.BigDecimal

fun main() {
    val list = listOf("a", 1, BigDecimal(666), 'p', 676, BigDecimal(185621.1752))
    println(getElementsOfType<BigDecimal>(list))
    list.filterIsInstance<BigDecimal>()
}

inline fun <reified T> getElementsOfType(input: List<Any>): List<T> {
    val output = ArrayList<T>()
    input.forEach {
        if (it is T) {
            output.add(it)
        }
    }
    return output
}
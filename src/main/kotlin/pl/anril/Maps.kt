package pl.anril

fun main() {
    val map = mapOf("a" to 2, Pair("b", 3), Pair("c", 4))
    println(map)

    val carMap = mapOf(
        1 to Car("red", "Toyota", 2020),
        2 to Car("grey", "Renault", 2006)
    )

    println(carMap.javaClass)
    println(carMap)

    val pair = Pair(10, "ten")
    val (firstVal, lastVal) = pair
    println("firstVal = $firstVal, lastVal = $lastVal")

    val triple = Triple(10, "ten", "dziesięć")
    val (one, two, three) = triple
    println("one = $one, two = $two, three = $three")
}
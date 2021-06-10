package pl.anril

fun main() {
    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2019),
        2 to Car("red", "Ford", 2020),
        8 to Car("yellow", "Ford", 2020),
        7 to Car("blue", "Ford", 2020),
        3 to Car("silver", "Honda", 2013)
    )

    println(immutableMap.asSequence().filter { it.value.model == "Ford" }.map { it.value.color }.toList())

}
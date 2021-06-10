package pl.anril

fun main() {
    val setInts = setOf(10, 15, 19, 5, 3, -22)
    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2019),
        2 to Car("red", "Ford", 2020),
        3 to Car("silver", "Honda", 2013)
    )

    val filteredSet = setInts.filter { it % 2 != 0 }
    println(filteredSet.javaClass)
    println(filteredSet)
    println("----------")
    println(immutableMap.filter { it.value.year == 2013 })
    println("----------")
    val ints = arrayOf(1,2,3,4,5)
    println(ints.flatMap { (1..it).toList() })
    val list = listOf(1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1)
    val set = list.filter { it % 2 ==0 }.toSet()
    println(set.javaClass)
    println(set)
}
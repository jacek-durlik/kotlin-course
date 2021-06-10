package pl.anril

fun main() {
    val mutable = mutableListOf("A", "B", "C")
    mutable.add("D")
    println(mutable.joinToString(separator = ",\n") { it })
    val arrayList= listOf(1,2,3,4)
    println(arrayList.javaClass)
    val array = arrayOf(1,2,3)
    val listFromArray = array.toList()
    println(listFromArray)

    println("--------------------")
    val strings = listOf("spring", "summer", "autumn", "summer", "winter")
    val colorList = listOf("black", "white", "red", "black", "red")

    println(strings.last())
    println(strings.asReversed())
    println(strings.getOrElse(5) { "not found!" })
    val mergedList = colorList + strings
    println(mergedList)

    val mergedNotDuplicatesList = colorList.union(strings)
    println(mergedNotDuplicatesList)
}
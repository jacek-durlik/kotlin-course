package pl.anril

fun main() {
    val set = mutableSetOf(1, 2, 3, 4, 3)
    set.add(20)
    println(set.average())
}
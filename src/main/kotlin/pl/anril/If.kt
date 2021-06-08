package pl.anril

fun main(args: Array<String>) {
    val someCondition = false
    var num: Int = if (someCondition) 5 else 3
    println(num)
}
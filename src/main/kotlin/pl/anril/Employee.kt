package pl.anril

fun main(args: Array<String>) {
    val emp = Employee2("Jacek", 666)
    println("emp name = ${emp}")
}

private data class Employee2(private val name: String, private val id: Int) {
}
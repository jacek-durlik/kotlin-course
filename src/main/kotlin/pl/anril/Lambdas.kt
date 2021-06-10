package pl.anril

fun main() {
    run { println("I'm in a lambda") }
    val employees: List<Employee> = arrayListOf(
        Employee("Jacek", 2),
        Employee("Kasia", 3),
        Employee("Grzegorz", 4))

    println(employees.minByOrNull { it.id })
    run(::topLevel)
    println(countTo100Apply())

    println(employees.firstOrNull { it.name == "Jacek" })
}

fun countTo100() = (1..100).joinToString { it.toString() }

fun countTo100With() = with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }


fun countTo100Apply() = StringBuilder().apply {
                            for (i in 1..99) {
                                append("$i, ")
                            }
                            append(100)
                        }.toString()

fun topLevel() = println("I'm in a function and my param is")
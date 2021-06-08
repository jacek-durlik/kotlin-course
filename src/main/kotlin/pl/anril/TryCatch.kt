package pl.anril

fun main(args: Array<String>) {
    println(getNumber("dupa") ?: "exception")
    notImplementedYet("test")
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (ex: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally block")
    }
}

fun notImplementedYet(sth: String) {
    TODO("Implement me!")
}
package academy.learnprogramming.challenge1

fun main(args: Array<String>) {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println("Hello1 is referentially equal to hello2: ${hello1 === hello2}")
    println("Hello1 is structurally equal to hello2: ${hello1 == hello2}")

    var number = 2988

    val text: Any = "The Any type is the root of Kotlin class hierarchy"

    if (text is String) {
        println(text.uppercase())
    }

    println("""
    1   1
    1  11
    1 111
    11111   
    """.trimMargin("1"))

    val list = mutableListOf("jacek", "placek")

}
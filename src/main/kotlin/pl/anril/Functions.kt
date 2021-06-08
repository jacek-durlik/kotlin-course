package pl.anril

fun main(args: Array<String>) {
    println(multiply("test", 3,4))
    dupa("Hello", "world")
    println(whatever())
    println("person = ${Person("jacek").uppercaseFirstName()}")
    colours(Car("green", "toyota", 2010), Car("red", "lamborghini", 1990))
    var numbers = arrayOf(1,2,3,5)
    val car1 = Car("Blue", "Hyundai", 2010)
    val car2 = Car("Grey", "Jeep", 2020)
    val car3 = Car("Black", "Mitsubishi", 2017)
    val cars = arrayOf(car1, car2, car3)
    colours(*cars)
    println("dupa".upperFirstAndLast())
}

fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0,1).uppercase()
    val upperLast = substring(length-1).uppercase()
    return upperFirst + substring(1, length-1) + upperLast
}

fun colours(vararg cars: Car) = cars.forEach { println(it.color) }

inline fun multiply(label: String, x1: Int, x2:Int) = "$label ${x1 * x2}"

fun dupa(a: String, b:String) = println("$a $b")

fun whatever() = 3*4

class Person(val firstName: String) {
    fun uppercaseFirstName() = firstName.uppercase()
}

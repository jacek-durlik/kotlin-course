package academy.learnprogramming.challenge5

fun main(args: Array<String>) {
    // 1
    val joe = Person("Joe", "Jones", 45)

    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")
    hr()
    //2

    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val pMap = mapOf(
        joe.lastName to joe,
        jane.lastName to jane,
        mary.lastName to mary,
        john.lastName to john,
        jean.lastName to jean
    )

    // 3
    println(pMap.count { it.value.lastName.startsWith("S") })
    hr()

    //4
    val pairMap = pMap.map { Pair(it.value.firstName, it.value.lastName) }
    println(pairMap)
    hr()

    //5
    pMap.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }
    hr()

    //6
    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 10)

    val list3_1 = list1.filter { list2.contains(it) }
    val list3_2 = list1.filter { it in list2 }
    println(list3_1)
    hr()
    println(list3_2)
    hr()

    //7
    val regularPaper = Box<RegularPaper>()
    var paper = Box<Paper>()

    paper = regularPaper

    //8
    
}

data class Person(val firstName: String, val lastName: String, val age: Short) {

}

fun hr() {
    println("--------------------------------")
}

class Box<out T> {

}

open class Paper {

}

class RegularPaper:Paper() {

}

class PremiumPaper: Paper() {

}
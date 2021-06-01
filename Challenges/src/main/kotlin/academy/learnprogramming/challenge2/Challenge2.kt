package academy.learnprogramming.challenge2

fun main(args: Array<String>) {
    var float1: Float = (-3847.384).toFloat()
    var float2 = -3847.384f

    var nFloat1: Float? = (-3847.384).toFloat()
    var nFloat2: Float? = -3847.384f

    val shortArray = arrayOf<Short>(1, 2, 3, 4, 5)

    val intArray = Array<Int?>(40) { (it + 1) * 5 }
    intArray.forEach { println(it) }

    val chArray = charArrayOf('a', 'b', 'c')
    Challenge2Java.method1(chArray)

    val x: String? = "I AM IN UPPERCASE"

    val x1 = x?.lowercase() ?: "I give up"
    println(x1)

    val x2 = x?.let {
        it.lowercase().replace("am", "am not")
    }
    println(x2)

    val myNonNullVariable: Int? = null
    println(myNonNullVariable!!.toDouble())


}
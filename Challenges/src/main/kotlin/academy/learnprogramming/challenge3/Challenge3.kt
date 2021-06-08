package academy.learnprogramming.challenge3

import java.util.stream.Collectors

fun main() {
    val bike = Bicycle(2,3, 4)
    bike.printDescription()
    val mountainBike = MountainBike(9,8,7,6)
    mountainBike.printDescription()
    val roadBike = RoadBike(5,6,7,8)
    roadBike.printDescription()

    val bike1 = Bicycle(7,8)
    bike1.printDescription()

    val mountainBike1 = MountainBike(8,6,3)
    mountainBike1.printDescription()

    val roadBike1 = RoadBike(4, 6, tireWidth = 8)
    roadBike1.printDescription()


    val mountainBike2 = MountainBike("red")
    mountainBike2.printDescription()
    MountainBike.printColours()
}

open class Bicycle(var cadence: Int, var speed: Int, var gear: Int = 10){
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of" +
                " $cadence travelling at a speed of $speed.")
    }
}

class MountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear:Int = 10):Bicycle(cadence, speed, gear) {

    companion object{
        private val availableColours = listOf("blue", "red", "white", "black", "green", "brown")

        fun printColours() {
            println("available colours are: ${availableColours.joinToString(separator = ";") { it }}")
        }
    }

    constructor(colour: String): this(3,4,5) {
        println("colour = $colour")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

class RoadBike(cadence:Int, speed: Int, gear: Int = 10, val tireWidth: Int): Bicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth mm.")
    }
}


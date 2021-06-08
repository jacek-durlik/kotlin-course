package pl.anril

fun main(args: Array<String>) {
    val laserPrinter = SpecialLaserPrinter("Canon")
    laserPrinter.printModel()
    laserPrinter.dupa()
    val bike: Bicycle = MountainBike(1, 2, 3, 4)
    bike.speed = 666
    println("bike = $bike")
}

abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is: $modelName")
    abstract fun dupa()
}

open class LaserPrinter(modelName: String): Printer(modelName) {
    final override fun printModel() = println("The model name of this laser printer is: $modelName")
    override fun dupa() = println("dupa")
}

class SpecialLaserPrinter(modelName: String): LaserPrinter(modelName) {

}

class Implementer: MyInterface, MyInterface2 {
    override fun myFunction(str: String): String = "String is: $str"

}

interface MyInterface {
    fun myFunction(str: String): String
}

interface MyInterface2 {
    fun myFunction(str: String): String
}

open class Class1 {
    fun doSth(num: Int) = 23
}

open class Class2 {
    fun doSth(num: Int) = 42
}

class MountainBike(val seatHeight: Int, speed: Int, gear: Int, cadence: Int): Bicycle(speed, gear, cadence) {
    override fun toString(): String {
        return "MountainBike(seatHeight=$seatHeight) ${super.toString()}"
    }
}
package pl.anril

fun main(args: Array<String>) {
    val car1 = Car("blue", "Toyota", 2015)
    val car2 = car1.copy()
    println("car1 structurally equals car2 ${car1 == car2}")
    println("car1 is the same object as car2 ${car1 === car2}")
}

data class Car(val color: String, val model: String, val year: Int){

}

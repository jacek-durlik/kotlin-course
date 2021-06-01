package pl.anril


fun main(args: Array<String>) {
    val employee1 = Employee("Mary", 1)
    val employee2 = Employee("John", 2)
    val employee3 = Employee("John", 2)

    println(employee1 == employee2)
    println(employee2 == employee3)
    println(employee1.equals(employee2))
    println(employee2.equals(employee3))


}

data class Employee(var name: String, val id: Int) {

}
package pl.anril

enum class Department(val fullName: String, val emploeees: Int) {
    HR("Human Resources", 5),
    IT("Information technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 7);

    fun getDepartmentInfo(): String = "$fullName department has $emploeees employees"

}
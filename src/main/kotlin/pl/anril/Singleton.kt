package pl.anril

import java.time.Year

fun main(args: Array<String>) {
    println(CompanyCommunications.getTagline())
    println(CompanyCommunications.getCopyrightLine())
    println(Department.ACCOUNTING.getDepartmentInfo())
}

object CompanyCommunications {
    fun getTagline() = "Our company rocks"
    private val curYear = Year.now().value
    fun getCopyrightLine() = "Copyright \u00A9 $curYear Our Company. All rights reserved."

}
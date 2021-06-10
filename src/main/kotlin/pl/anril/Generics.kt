package pl.anril

fun main() {
    val mutableList = mutableListOf("Hello")
    mutableList.add("World")
    mutableList[0]=mutableList[0].uppercase()
    println(mutableList)
    printCollection<String>(mutableList)
    append(StringBuilder("hello"), StringBuilder("world"))

    val listAny = listOf("a", "b", "c")
//    if (listAny is List<*>)
}

fun <T> printCollection(collection: List<T>) {
    collection.forEach{println(it)}
}

fun <T: Number> convertToInt(collection: List<T>) {
    collection.forEach{println(it.toInt())}
}

fun <T> append(item1: T, item2: T)
    where T: CharSequence, T: Appendable {
        println("Result is: `${item1.append(item2)}`")
}
package pl.anril

fun main(args: Array<String>) {
    SomeOtherClass().someOtherMethod()

    val test = SomeClass2.justAssign("dupa")
    println(test.str)
    val upper = SomeClass2.upperOrLowercase("terefere", true)
    println(upper)
    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int): String = "return from implementer $num"
    })
}

class SomeClass {
    companion object SomeCompanion {
        private const val privateVar = 6
        fun accessPrivateVar() = println("I'm accessing privateVar: $privateVar")
    }
}

class SomeOtherClass {
    fun someOtherMethod() = SomeClass.accessPrivateVar()
}

data class SomeClass2 private constructor(val str: String) {
    companion object {
        private const val value = 6
        fun justAssign(str: String) = SomeClass2(str)
        fun upperOrLowercase(str: String, uppercase: Boolean): SomeClass2 {
            return if(uppercase) {
                SomeClass2(str.uppercase())
            } else {
                SomeClass2(str.lowercase())
            }
        }
    }
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(input: SomeInterface) {
    println("printing ${input.mustImplement(10)}")
}
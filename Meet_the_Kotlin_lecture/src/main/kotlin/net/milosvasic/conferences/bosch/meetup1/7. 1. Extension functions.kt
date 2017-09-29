package net.milosvasic.conferences.bosch.meetup1

/**
 * Extension functions, showing the scope
 */
class Example18(private val param: String) {

    /**
     * Accessible only in Example18 class instances
     */
    fun String.specialStrip(): String {
        return this.replace(" ", "*")
    }

    fun print() {
        println(param.specialStrip())
    }
}

// Let's try it:
fun main(args: Array<String>) {

    val example = Example18("This is a sentence.")
    example.print() // Will output: This*is*a*sentence.

}
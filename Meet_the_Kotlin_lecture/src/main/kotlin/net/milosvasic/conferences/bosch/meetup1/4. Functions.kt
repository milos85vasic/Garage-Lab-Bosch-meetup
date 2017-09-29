package net.milosvasic.conferences.bosch.meetup1

/**
 * Let's present some functions.
 */
fun example() {
    println("example")
}

// Can become:
fun example2() = println("example")

// With some arguments:
fun example3(arg1: Int, arg2: Long) {
    println("[ $arg1 ][ $arg2 ]")
}

// With some arguments with default values:
fun example4(arg1: Int = -1, arg2: Long = -1) {
    println("[ $arg1 ][ $arg2 ]")
}

// Which will give us the following possibility:
fun tryExample4() {
    example4()
    example4(10)    // arg1 is 10
    example4(arg2 = 10)   // arg2 is 10
}

// Returning the value:
fun example5(arg1: Int = -1, arg2: Long = -1): String {
    return "[ $arg1 ][ $arg2 ]"
}

// Local scope functions:
fun example6(arg1: Int = -1, arg2: Long = -1): String {

    /**
     * This method has a local scope. Not visible outside example6 method!
     */
    fun generateString(arg1: Int, arg2: Long): String {
        return "[ $arg1 ][ $arg2 ]"
    }

    return generateString(arg1, arg2)
}


package net.milosvasic.conferences.bosch.meetup1

/**
 * Classes
 */

class Dummy

class Dummy2(arg: Int) // We will not be able to access 'arg'

class Dummy3(val arg: Int) // We will be able to access 'arg'

class Dummy4(var arg: Int) // We will be able to access 'arg' and change it

class Example(
        private var arg1: Int,
        private var arg2: Int
) {
    fun describeMe() = "[ $arg1 ][ $arg2 ]"
}

class Example2(
        private var arg1: Int,
        private var arg2: Int
) {

    private val value: Int

    init {
        value = arg1 + arg2
    }

    fun describeMe() = value.toString()
}

// Or move all of above into constructor:
class Example3(
        private var arg1: Int,
        private var arg2: Int,
        private val value: Int = arg1 + arg2    // Type is required in primary constructor
) {
    fun describeMe() = value.toString()
}

// Add one more constructor
class Example4(
        private var arg1: Int,
        private var arg2: Int,
        private var value: Int = arg1 + arg2    // Type is required in primary constructor
) {

    constructor(arg: Int) : this(1, 1) {        // Passing 1 for arg1 and arg2
        value += arg
    }

    fun describeMe() = value.toString()
}
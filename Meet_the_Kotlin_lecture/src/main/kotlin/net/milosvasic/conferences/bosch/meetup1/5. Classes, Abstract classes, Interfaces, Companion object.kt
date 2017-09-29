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

/**
 * Inheritance
 */
class Example6

// class Example7 : Example6()                  // Compiler complains since classes are by default closed!

// So let's create one that we actually can extend!
open class Example7 {

    fun method1(){}

    open fun method2(){}

}

class Example8 : Example7(){

//    override fun method1() {                  <--- Compiler complains. Can't override method1() since it is not open!
//        super.method2()
//        println("And some more functionality added.")
//    }

    override fun method2() {
        super.method2()
        println("And some more functionality added.")
    }
}

/**
 * Class visibility
 */
class Example9                                  // Package level
public class Example10                          // Publicly visible
private class Example11                         // Visible only in the scope of the current context.
internal class Example12                        // Visible only in the current module. This is great if making SDK!


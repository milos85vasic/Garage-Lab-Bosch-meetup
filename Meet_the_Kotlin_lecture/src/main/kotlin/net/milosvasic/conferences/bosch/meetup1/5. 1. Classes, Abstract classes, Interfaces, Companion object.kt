package net.milosvasic.conferences.bosch.meetup1

/**
 * Abstract Classes
 */
abstract class DummyAbstract1

abstract class DummyAbstract2 {

    abstract fun print()

}

class Example13 : DummyAbstract1()

class Example14(val param: Int) : DummyAbstract1()

open class Example15(val param: Int) : DummyAbstract1()             // Can be further extended

// class Example16(val param: Int) : DummyAbstract2()               // Compiler complains. We must implement abstract methods.

// So here we go:
class Example16(val param: Int) : DummyAbstract2() {

    /**
     * We override all abstract methods
     */
    override fun print() {
        // Do something
    }

}

// One more implementation
class Example17(val param: Int) : DummyAbstract2() {
    override fun print() {
        // Do something
    }
}

/**
 * Let's play with types
 */
fun typesExample() {
    val items = listOf(
            Example16(1),
            Example16(2),
            Example17(3),
            Example16(4),
            Example17(5)
    )

    items.forEach { item ->
        when (item) {
            is Example16 -> {
                println("A")
            }
            is Example17 -> {
                println("B")
            }
        }
    }
}

/**
 * Output will be:
 *
 * A
 * A
 * B
 * A
 * B
 */
fun main(args: Array<String>) = typesExample()


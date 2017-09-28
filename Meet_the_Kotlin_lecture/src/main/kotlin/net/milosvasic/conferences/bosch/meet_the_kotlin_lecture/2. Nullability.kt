package net.milosvasic.conferences.bosch.meet_the_kotlin_lecture

var d1 = 10

/**
 * Compiler complains!
 */
// var d2 : Int = null

/**
 * This is null, since there is no data type.
 */
var d3 = null

/**
 * d4 is explicitly set to null
 */
var d4 : TestClass2? = null

class TestClass2 {

    fun testMethod2(){
        println("Kotlin")
    }

}


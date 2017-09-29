package net.milosvasic.conferences.bosch.meetup1

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
var d4: TestClass2? = null

var d5: TestClass3? = null

class TestClass2 {

    fun testMethod2() {
        println("Kotlin")
    }

}

class TestClass3 {

    var testData: TestClass4? = null

    fun testMethod3() {
        println("Kotlin")
    }

}

class TestClass4 {

    fun testMethod4() {
        println("Kotlin")
    }

}


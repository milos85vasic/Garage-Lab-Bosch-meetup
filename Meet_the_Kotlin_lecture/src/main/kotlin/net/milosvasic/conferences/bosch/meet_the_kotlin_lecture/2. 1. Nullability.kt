package net.milosvasic.conferences.bosch.meet_the_kotlin_lecture

/**
 * Nothing happens since d4 is set to null.
 * Most important, application does not crash!
 */
fun nullability() {

    d4?.testMethod2() // ?. is elvis operator!

}

/**
 * If not null then do something
 */
fun nullability2() {
    d4?.let {
        // Do something here!
    }
}

/**
 * Will not crash!
 */
fun nullability3() {
    d5?.testData?.testMethod4() // In Java we would need multiple if != null checks.
}

/**
 * Let's force crash!
 */
fun nullability4() {
    d5!!.testData?.testMethod4() // !! operator explicitly tells that this is not null (even it is)!
}
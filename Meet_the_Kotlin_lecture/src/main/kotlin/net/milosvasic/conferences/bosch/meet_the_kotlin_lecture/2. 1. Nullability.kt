package net.milosvasic.conferences.bosch.meet_the_kotlin_lecture

/**
 * Nothing happens since d4 is set to null.
 * Most important, application does not crash!
 */
fun nullability() {

    d4?.testMethod2()

}

/**
 * If not null then do something
 */
fun nullability2() {
    d4?.let {
        // Do something here!
    }
}
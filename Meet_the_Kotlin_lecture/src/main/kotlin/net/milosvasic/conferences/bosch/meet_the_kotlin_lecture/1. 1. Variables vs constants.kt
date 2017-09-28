package net.milosvasic.conferences.bosch.meet_the_kotlin_lecture

class TestClass1 {

    /**
     * Accessing global constant and variable.
     */
    fun testMethod1() {
        b = 7
        /**
         * Compiler complains: Val cannot be reassigned.
         */
        // c = 4
    }

}
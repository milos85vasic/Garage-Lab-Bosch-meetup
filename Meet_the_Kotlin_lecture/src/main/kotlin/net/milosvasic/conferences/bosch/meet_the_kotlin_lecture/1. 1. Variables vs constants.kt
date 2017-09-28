package net.milosvasic.conferences.bosch.meet_the_kotlin_lecture

class TestClass1 {

    /**
     * Accessing global constant and variable.
     */
    fun testMethod1() {
        a = 7
        /**
         * Compiler complains: Val cannot be reassigned.
         */
        // b = 4
    }

}
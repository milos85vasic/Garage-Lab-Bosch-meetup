package net.milosvasic.conferences.bosch.meetup1

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
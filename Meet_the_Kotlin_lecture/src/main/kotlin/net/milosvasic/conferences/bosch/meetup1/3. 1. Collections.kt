package net.milosvasic.conferences.bosch.meetup1

/**
 * Let's tryout our collections
 */
fun tryCollections() {
    /**
     * Adding items
     */
    // carList.add("Mercedes")  // There is no add method for immutable collections!
    // The same applies for sets and maps!

    mCarList.add("Mercedes")

    mCarSet.add("Mercedes")     // Will have only 3 members since this is set!
    mCarSet.add("Mercedes")
    mCarSet.add("Mercedes")
    mCarSet.add("Mercedes")

    mCarMap.put("Mercedes", "Diesel")

    /**
     * Accessing items
     */
    // var car = carList[0]     <--- This will crash: IndexOutOfBoundsException: Empty list doesn't contain element at index 0.
    var car = carList2[0]    // <--- So we will use the list that actually has something in it.
    // car = carMap["Diesel"]   <--- Compiler will complain!
    //                          carMap["Diesel"] returns String?
    //                          since we may or may not have map member with the key "Diesel"
    // So we will try this:
    val c = carList2[0]       // If there is a member in the map, assign value to our variable.
    c.let {
        car = c
        println("We assigned value to c -> '$car'") // Observe: ... [ $car ] ... Kotlin has String patterns!
    }
}

// Let's check if last example has printed something:
fun main(args: Array<String>) = tryCollections()

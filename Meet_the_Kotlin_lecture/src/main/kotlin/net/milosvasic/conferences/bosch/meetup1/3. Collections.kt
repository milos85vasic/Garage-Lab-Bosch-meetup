package net.milosvasic.conferences.bosch.meetup1

/**
 * Immutable collections
 */
val carList = listOf<String>() // Can't add new members!
val carList2 = listOf("Bmw", "Fiat")

val carSet = setOf<String>() // Can't add new members!
val carSet2 = setOf("Bmw", "Fiat", "Fiat", "Fiat") // Contains only 2 members!

val carMap = mapOf<String, String>() // Empty, and can't add new members as well!
val carMap2 = mapOf(
        Pair("Bmw", "Diesel"),
        Pair("Fiat", "Benin")
)

/**
 * Mutable collections (we can add new members)
 */
val mCarList = mutableListOf<String>()
val mCarList2 = mutableListOf("Bmw", "Fiat")

val mCarSet = mutableSetOf<String>()
val mCarSet2 = mutableSetOf("Bmw", "Fiat")

val mCarMap = mutableMapOf<String, String>()
val mCcarMap2 = mutableMapOf(
        Pair("Bmw", "Diesel"),
        Pair("Fiat", "Benin")
)


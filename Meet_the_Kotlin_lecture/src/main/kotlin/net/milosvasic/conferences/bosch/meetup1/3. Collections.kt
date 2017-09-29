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
val mCarList = listOf<String>()
val mCarList2 = listOf("Bmw", "Fiat")

val mCarSet = setOf<String>()
val mCarSet2 = setOf("Bmw", "Fiat")

val mCarMap = mapOf<String, String>()
val mCcarMap2 = mapOf(
        Pair("Bmw", "Diesel"),
        Pair("Fiat", "Benin")
)


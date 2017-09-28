package net.milosvasic.conferences.bosch.meet_the_kotlin_lecture

/**
 * Variable in Kotlin.
 *
 * 'a' is globally visible
 */
var a = 5

/**
 * Constant in Kotlin.
 */
val b = 10

/**
 * In whole Kotlin wherever is possible language will detect the type and we don't need to provide it explicitly.
 */
val c : String = "Something" // -> val c = "String", Kotlin is smart enough to know the type.
val d = "Something"          // like this.


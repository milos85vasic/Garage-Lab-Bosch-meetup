package net.milosvasic.conferences.bosch.meetup1

/**
 * Extension functions
 */
fun String.strip(): String {
    return this.replace("_", " ")
}

fun main(args: Array<String>) = println("STRIP_ME_NOW!".strip())
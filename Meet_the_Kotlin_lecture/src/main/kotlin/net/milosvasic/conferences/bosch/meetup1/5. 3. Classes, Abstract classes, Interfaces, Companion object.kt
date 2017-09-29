package net.milosvasic.conferences.bosch.meetup1

/**
 * Companion object
 *
 * A companion object is a specific type of object declaration
 * that allows an object to act similar to static objects in other languages (such as Java).
 */
class MyManagerClass {

    companion object {
        val URL = "http://exemple.com/"

        fun getSomeMagic() = "Maaaagic ;)"
    }

}

/**
 * Using companion object
 */
val url = MyManagerClass.URL // No class instantiation.

val magic = MyManagerClass.getSomeMagic()

/**
 * Using object with interface
 */
val audio = object : Volume {
    override fun volumeUp() {
        println("volumeUp")
    }

    override fun volumeDown() {
        println("volumeDown")
    }

    override fun setVolume(volume: Int) {
        println("setVolume: $volume")
    }

    override fun getVolume(): Int {
        return 0
    }
}

// To use the object:
// audio.setVolume(10)

/**
 * Using object with abstract class
 */
val tv = object : Tv() {
    override fun togglePower() {
        // ...
    }

    override fun volumeUp() {
        // ...
    }

    override fun volumeDown() {
        // ...
    }

    override fun setVolume(volume: Int) {
        // ...
    }

    override fun getVolume(): Int {
        return 0
    }
}
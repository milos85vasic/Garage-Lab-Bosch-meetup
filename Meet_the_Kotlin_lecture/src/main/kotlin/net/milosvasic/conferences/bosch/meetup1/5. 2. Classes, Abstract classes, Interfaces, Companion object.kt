package net.milosvasic.conferences.bosch.meetup1

/**
 * Interfaces
 */
interface Device

interface Power {

    fun togglePower()

}

interface Volume {

    fun volumeUp()

    fun volumeDown()

    fun setVolume(volume: Int)

    fun getVolume(): Int

}

abstract class Tv : Device, Power, Volume

open class Sony : Tv() {
    private var volume = 0

    override fun togglePower() {
        println("Power toggle")
    }

    override fun volumeUp() {
        volume++
    }

    override fun volumeDown() {
        volume--
    }

    // No need to open because this methods are already open!
    open override fun setVolume(volume: Int) {
        this.volume = volume
    }

    open override fun getVolume() = volume

    // However we will have some more methods:
    fun channelUp() = println("Channel up")

    fun channelDown() = println("Channel down")

    // And open this one:
    open fun setChannel(channel: String) = println("Channel: $channel")
}

class Bravia : Sony() {
    override fun togglePower() {
        super.togglePower()
        println("-> togglePower")           // We will append more functionality
    }

    override fun volumeUp() {
        super.volumeUp()
        println("-> volumeUp")
    }

    override fun volumeDown() {
        super.volumeDown()
        println("-> volumeDown")
    }

    override fun setVolume(volume: Int) {
        super.setVolume(volume)
        println("-> setVolume")
    }

    override fun getVolume(): Int {
        println("-> getVolume")
        return super.getVolume()
    }

    override fun setChannel(channel: String) {
        super.setChannel(channel)
        println("-> setChannel")
    }
}
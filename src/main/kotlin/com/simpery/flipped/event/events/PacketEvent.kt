package com.simpery.flipped.event.events

import net.minecraft.network.Packet
import net.minecraftforge.fml.common.eventhandler.Cancelable
import net.minecraftforge.fml.common.eventhandler.Event

@Cancelable
open class PacketEvent(val packet: Packet<*>) : Event() {
    var direction: Direction? = null

    class ReceiveEvent(packet: Packet<*>) : PacketEvent(packet) {
        init {
            direction = Direction.INBOUND
        }
    }

    class SendEvent(packet: Packet<*>) : PacketEvent(packet) {
        init {
            direction = Direction.OUTBOUND
        }
    }

    enum class Direction {
        INBOUND, OUTBOUND
    }
}
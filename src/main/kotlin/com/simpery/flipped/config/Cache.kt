package com.simpery.flipped.config

import com.simpery.flipped.event.Listener
import com.simpery.flipped.event.SkyblockIsland

object Cache {
    val inDungeon
        get() = Listener.island == SkyblockIsland.Dungeon

    @JvmField
    var inSkyblock = false
    val inWorkshop
        get() = Listener.island == SkyblockIsland.JerryWorkshop
    val onIsland
        get() = Listener.island == SkyblockIsland.PrivateIsland
    val isJacob
        get() = Listener.jacobEvent

    @JvmField
    var prevIP = ""

    @JvmField
    var prevName = ""

    @JvmField
    var prevIsLan = false
}
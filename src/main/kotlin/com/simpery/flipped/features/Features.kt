package com.simpery.flipped.features

import com.simpery.flipped.features.Test.Test
import net.minecraftforge.common.MinecraftForge
import com.simpery.flipped.features.bazaar.*

object Features {

    var features: MutableList<Feature> = mutableListOf(
        Test(),
        Bazaar()
    )

    fun register() = features.forEach { MinecraftForge.EVENT_BUS.register(it) }
}
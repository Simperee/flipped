package com.simpery.flipped.features

import net.minecraft.client.Minecraft

abstract class Feature {
    protected val mc: Minecraft = Minecraft.getMinecraft()
}
package com.simpery.flipped.event.events

import net.minecraft.client.gui.inventory.GuiContainer
import net.minecraft.inventory.Slot
import net.minecraftforge.fml.common.eventhandler.Event

abstract class DrawSlotEvent(open val gui: GuiContainer, open val slot: Slot) : Event() {
    data class Pre(override val gui: GuiContainer, override val slot: Slot) : DrawSlotEvent(gui, slot)

    data class Post(override val gui: GuiContainer, override val slot: Slot) : DrawSlotEvent(gui, slot)
}
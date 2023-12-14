package com.simpery.flipped.event.events

import net.minecraft.client.gui.inventory.GuiContainer
import net.minecraft.inventory.Slot
import net.minecraftforge.fml.common.eventhandler.Cancelable
import net.minecraftforge.fml.common.eventhandler.Event

@Cancelable
class ClickSlotEvent(val gui: GuiContainer, val slot: Slot?, val button: Int) : Event()
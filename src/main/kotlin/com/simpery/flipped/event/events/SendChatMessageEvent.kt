package com.simpery.flipped.event.events

import net.minecraftforge.fml.common.eventhandler.Cancelable
import net.minecraftforge.fml.common.eventhandler.Event

@Cancelable
data class SendChatMessageEvent(val message: String, val addToChat: Boolean) : Event()
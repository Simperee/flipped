package com.simpery.flipped.event.events

import net.minecraft.entity.Entity
import net.minecraftforge.fml.common.eventhandler.Cancelable
import net.minecraftforge.fml.common.eventhandler.Event

@Cancelable
class PlayerAttackEvent(val target: Entity) : Event()
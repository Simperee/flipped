package com.simpery.flipped.event.events

import net.minecraft.client.model.ModelBase
import net.minecraft.entity.EntityLivingBase
import net.minecraftforge.fml.common.eventhandler.Cancelable
import net.minecraftforge.fml.common.eventhandler.Event

@Cancelable
class RenderEntityModelEvent(
    val entity: EntityLivingBase,
    val model: ModelBase,
    val partialTicks: Float
) : Event()
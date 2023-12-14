package com.simpery.flipped.event.events

import net.minecraft.client.gui.ScaledResolution
import net.minecraft.scoreboard.ScoreObjective
import net.minecraftforge.fml.common.eventhandler.Cancelable
import net.minecraftforge.fml.common.eventhandler.Event

@Cancelable
class ScoreboardRenderEvent(val objective: ScoreObjective, val resolution: ScaledResolution) : Event()
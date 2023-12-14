package com.simpery.flipped.features.Test

import com.simpery.flipped.Flipped
import com.simpery.flipped.config.Config
import com.simpery.flipped.utils.ModUtils
import com.simpery.flipped.features.Feature
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.gameevent.InputEvent
import org.lwjgl.input.Keyboard

class Test : Feature() {
    @SubscribeEvent
    fun onKey(event: InputEvent.KeyInputEvent){
        if (mc.thePlayer == null || mc.theWorld == null) return
        if (!Keyboard.getEventKeyState()) return
        if (Keyboard.getEventKey() == Flipped.testKey.keyCode)
            if (Config.testToggle == true)
                ModUtils.sendMsg("Well done bitch")
    }

}
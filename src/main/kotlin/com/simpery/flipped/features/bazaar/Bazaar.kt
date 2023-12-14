package com.simpery.flipped.features.bazaar

import com.simpery.flipped.Flipped
import com.simpery.flipped.config.Cache
import com.simpery.flipped.config.Config
import com.simpery.flipped.event.events.PacketEvent
import com.simpery.flipped.utils.ModUtils
import com.simpery.flipped.features.Feature
import com.simpery.flipped.utils.TextUtils.stripColor
import net.minecraft.client.Minecraft
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraft.client.gui.inventory.GuiChest
import net.minecraft.inventory.ContainerChest
import net.minecraft.network.play.client.C0DPacketCloseWindow
import net.minecraft.network.play.server.S2DPacketOpenWindow
import net.minecraftforge.client.event.GuiOpenEvent
import net.minecraftforge.fml.common.gameevent.InputEvent
import org.lwjgl.input.Keyboard

//class Bazaar : Feature() {
//    @SubscribeEvent
//    fun onDrawBackground(event: GuiOpenEvent) {
//        if (event.gui is GuiChest && Cache.inSkyblock) {
//            val chestName = ((event.gui as GuiChest).inventorySlots as ContainerChest).lowerChestInventory.displayName.unformattedText
//            if (Cache.inSkyblock && Config.chesthackToggle && (chestName.contains("Bazaar"))) {
//                Minecraft.getMinecraft().thePlayer.closeScreen()
//            }
//        }
//    }
//
//    @SubscribeEvent
//    fun onKey(event: InputEvent.KeyInputEvent){
////        if (mc.thePlayer == null || mc.theWorld == null) return
////        if (!Keyboard.getEventKeyState()) return
//        if (Keyboard.getEventKey() == Flipped.chestKey.keyCode)
//            if (Config.chesthackToggle)
//                if (Cache.inSkyblock)
//                    ModUtils.sendMsg("In skyblock")
//                if (!Cache.inSkyblock)
//                    ModUtils.sendMsg("§4FAIL")
//    }
//}

class Bazaar : Feature() {
    @SubscribeEvent
    fun onPacket(event: PacketEvent.ReceiveEvent) {
        if (Config.chesthackToggle && event.packet is S2DPacketOpenWindow && event.packet.windowTitle.unformattedText.stripColor().contains("Bazaar"))
            mc.netHandler.networkManager.sendPacket(C0DPacketCloseWindow(event.packet.windowId))
    }
}
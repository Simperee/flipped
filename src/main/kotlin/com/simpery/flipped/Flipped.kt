package com.simpery.flipped

import com.simpery.flipped.commands.FlippedCommand
import com.simpery.flipped.config.Config
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.client.registry.ClientRegistry
import net.minecraft.client.settings.KeyBinding
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import com.simpery.flipped.features.Features
import org.lwjgl.input.Keyboard

@Mod(
    modid = "flipped",
    name = "Simpery's Auto-flipper",
    version = "1.0",
    acceptedMinecraftVersions = "[1.8.9]",
    modLanguageAdapter = "gg.essential.api.utils.KotlinAdapter",
    clientSideOnly = true
)
object Flipped {
    private val logger: Logger = LogManager.getLogger("Flipped")
    val testKey = KeyBinding("Better Bazaar", Keyboard.KEY_NONE, "Flipped")
    val chestKey = KeyBinding("Chest Check", Keyboard.KEY_NONE, "Flipped")

    @Mod.EventHandler
    fun onInit(event: FMLInitializationEvent) {
        logger.info("Initializing Auto-Flipper")

        Config.init()
        FlippedCommand.register()
        Features.register()
        MinecraftForge.EVENT_BUS.register(this)
        ClientRegistry.registerKeyBinding(testKey)
        ClientRegistry.registerKeyBinding(chestKey)
    }

}
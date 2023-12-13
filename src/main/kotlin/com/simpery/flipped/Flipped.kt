package com.simpery.flipped

import com.simpery.flipped.config.Config
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

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

    @Mod.EventHandler
    fun onInit(event: FMLInitializationEvent) {
        logger.info("Initializing Auto-Flipper")

        Config.init()
        FlippedCommand.register()
        MinecraftForge.EVENT_BUS.register(this)
    }

}
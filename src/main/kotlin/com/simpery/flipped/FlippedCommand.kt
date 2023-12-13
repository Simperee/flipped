package com.simpery.flipped

import gg.essential.api.commands.Command
import gg.essential.api.commands.DefaultHandler
import gg.essential.api.commands.SubCommand
import com.simpery.flipped.config.Config
import gg.essential.api.EssentialAPI

object FlippedCommand : Command("flipped") {
    override val commandAliases = setOf(Alias("fl"))

    @DefaultHandler
    fun handle() {
        EssentialAPI.getGuiUtil().openScreen(Config.gui())
    }

    @SubCommand("sub")
    fun sub() {
        Config
    }
}
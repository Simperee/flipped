package com.simpery.flipped.commands

import gg.essential.api.commands.Command
import gg.essential.api.commands.DefaultHandler
import gg.essential.api.commands.SubCommand
import com.simpery.flipped.config.Config
import com.simpery.flipped.utils.ModUtils
import gg.essential.api.EssentialAPI

object FlippedCommand : Command("flipped") {
    override val commandAliases = setOf(Alias("fl"))

    @DefaultHandler
    fun handle() {
        EssentialAPI.getGuiUtil().openScreen(Config.gui())
    }

    @SubCommand("sub")
    fun talk(text: String) {
        ModUtils.sendMsg(text)
    }
}
package com.simpery.flipped.config

import gg.essential.vigilance.Vigilant
import gg.essential.vigilance.data.Category
import gg.essential.vigilance.data.Property
import gg.essential.vigilance.data.PropertyType
import gg.essential.vigilance.data.SortingBehavior
import com.simpery.flipped.utils.mc
import java.io.File

object Config : Vigilant(File(mc.mcDataDir, "config/Flipped/config.toml"), "Simpery's Auto-flipper", sortingBehavior = Sorting()) {
    fun init() {
        val configFile = File(mc.mcDataDir, "config/Flipped/config.toml")
        if (!configFile.exists()) {
            configFile.parentFile.mkdirs()
            configFile.createNewFile()
        }

        initialize()
        markDirty()
    }

    private class Sorting : SortingBehavior() {
        private val categories = listOf(
            "General",
        )

        override fun getCategoryComparator(): Comparator<in Category> = compareBy { categories.indexOf(it.name) }
    }

    @Property(
        type = PropertyType.SWITCH,
        name = "Toggle",
        description = "Some toggle",
        category = "General",
        subcategory = "API"
    )
    var toggle = false

    @Property(
        type = PropertyType.SWITCH,
        name = "test command",
        category = "Testing",
        subcategory = "Bazaar",
        description = "Test command"
    )
    var testToggle = false

    @Property(
        type = PropertyType.SWITCH,
        name = "Test chest check",
        category = "Testing",
        subcategory = "Bazaar",
        description = "Test command"
    )
    var chesthackToggle = false
}
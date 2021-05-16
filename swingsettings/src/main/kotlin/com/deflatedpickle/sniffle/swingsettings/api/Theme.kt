@file:Suppress("unused", "UNUSED_PARAMETER", "SpellCheckingInspection")

package com.deflatedpickle.sniffle.swingsettings.api

import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import java.util.Enumeration
import javax.swing.UIManager
import javax.swing.plaf.FontUIResource
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
abstract class Theme(
    val id: String,
    private val project: Project,
    private val name: String = "",
) {
    constructor(
        project: Project,
        name: String = "",
    ) : this(
        "${
            project
                .name
                .toLowerCase()
        }-${
            name.toLowerCase()
                .replace(
                    "_",
                    " "
                )
        }",
        project,
        name
    )

    // Use this theme
    // Needed as some themes have different methods to apply them
    abstract fun changeTo()

    // Change the font used with this theme
    // Not static as some themes need to override how the font is changed
    open fun setFont(font: Font) {
        val f = FontUIResource(font.name.name, font.style.ordinal, font.size)
        val keys: Enumeration<*> = UIManager.getDefaults().keys()

        while (keys.hasMoreElements()) {
            val key = keys.nextElement()
            val value = UIManager.get(key)

            if (value is FontUIResource) UIManager.put(key, f)
        }
    }

    @OptIn(ExperimentalStdlibApi::class)
    override fun toString(): String = "[${project.name.lowercase().capitalize()}] $name"
}
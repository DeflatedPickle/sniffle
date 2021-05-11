package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import com.formdev.flatlaf.FlatDarculaLaf
import com.formdev.flatlaf.FlatDarkLaf
import com.formdev.flatlaf.FlatIntelliJLaf
import com.formdev.flatlaf.FlatLightLaf
import javax.swing.UIManager
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafLightTheme : Theme(
    "flatlaf_light",
    Project.FLATLAF,
    "Light",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(FlatLightLaf())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafDarkTheme : Theme(
    "flatlaf_dark",
    Project.FLATLAF,
    "Dark",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(FlatDarkLaf())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafIntelliJTheme : Theme(
    "flatlaf_intellij",
    Project.FLATLAF,
    "IntelliJ",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(FlatIntelliJLaf())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafDarculaTheme : Theme(
    "flatlaf_darcula",
    Project.FLATLAF,
    "Darcula",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(FlatDarculaLaf())
    }
}
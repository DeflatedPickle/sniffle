package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import com.formdev.flatlaf.FlatDarculaLaf
import com.formdev.flatlaf.FlatDarkLaf
import com.formdev.flatlaf.FlatIntelliJLaf
import com.formdev.flatlaf.FlatLightLaf
import javax.swing.UIManager
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

object FlatLaf : Project("FLATLAF")

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafLightTheme : Theme(
    FlatLaf,
    "Light",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(FlatLightLaf())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafDarkTheme : Theme(
    FlatLaf,
    "Dark",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(FlatDarkLaf())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafIntelliJTheme : Theme(
    FlatLaf,
    "IntelliJ",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(FlatIntelliJLaf())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafDarculaTheme : Theme(
    FlatLaf,
    "Darcula",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(FlatDarculaLaf())
    }
}
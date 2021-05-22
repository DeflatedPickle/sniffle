/* Copyright (c) 2021 DeflatedPickle under the MIT license */

@file:Suppress("unused")

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Font
import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import com.sun.java.swing.plaf.motif.MotifLookAndFeel
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import javax.swing.UIManager
import javax.swing.plaf.metal.MetalLookAndFeel
import javax.swing.plaf.nimbus.NimbusLookAndFeel
import java.awt.Font as AWTFont

object Swing : Project("SWING")

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object SwingMetalTheme : Theme(
    Swing,
    "Metal",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object SwingNimbusTheme : Theme(
    Swing,
    "Nimbus",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(NimbusLookAndFeel())
    }

    override fun setFont(font: Font) {
        UIManager.getLookAndFeelDefaults()["defaultFont"] =
            AWTFont(font.name.name, font.style.ordinal, font.size)
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object SwingMotifTheme : Theme(
    Swing,
    "Motif",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(MotifLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object SwingNativeTheme : Theme(
    Swing,
    "System",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
    }
}

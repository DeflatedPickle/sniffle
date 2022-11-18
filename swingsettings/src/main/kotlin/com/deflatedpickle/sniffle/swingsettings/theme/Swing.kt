/* Copyright (c) 2021 DeflatedPickle under the MIT license */

@file:Suppress("JAVA_MODULE_DOES_NOT_EXPORT_PACKAGE", "unused")

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Font
import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.sun.java.swing.plaf.motif.MotifLookAndFeel
import javax.swing.UIManager
import javax.swing.plaf.metal.MetalLookAndFeel
import javax.swing.plaf.nimbus.NimbusLookAndFeel
import java.awt.Font as AWTFont

object Swing : Project("SWING")

object SwingMetalTheme : Theme(
    Swing,
    "Metal",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

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

object SwingMotifTheme : Theme(
    Swing,
    "Motif",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(MotifLookAndFeel())
    }
}

object SwingNativeTheme : Theme(
    Swing,
    "System",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
    }
}

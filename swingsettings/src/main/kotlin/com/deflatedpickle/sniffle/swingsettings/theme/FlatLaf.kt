/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.formdev.flatlaf.FlatDarculaLaf
import com.formdev.flatlaf.FlatDarkLaf
import com.formdev.flatlaf.FlatIntelliJLaf
import com.formdev.flatlaf.FlatLightLaf
import javax.swing.UIManager

object FlatLaf : Project("FLATLAF")

object FlatLafLightTheme : Theme(
    FlatLaf,
    "Light",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(FlatLightLaf())
    }
}

object FlatLafDarkTheme : Theme(
    FlatLaf,
    "Dark",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(FlatDarkLaf())
    }
}

object FlatLafIntelliJTheme : Theme(
    FlatLaf,
    "IntelliJ",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(FlatIntelliJLaf())
    }
}

object FlatLafDarculaTheme : Theme(
    FlatLaf,
    "Darcula",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(FlatDarculaLaf())
    }
}

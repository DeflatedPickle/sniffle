/* Copyright (c) 2023 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.flatlaf.intellijthemes.FlatCatppuccinFrappeIJTheme
import com.deflatedpickle.flatlaf.intellijthemes.FlatCatppuccinLatteIJTheme
import com.deflatedpickle.flatlaf.intellijthemes.FlatCatppuccinMacchiatoIJTheme
import com.deflatedpickle.flatlaf.intellijthemes.FlatCatppuccinMochaIJTheme
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import java.awt.Color
import javax.swing.UIManager

object FlatLafCatppuccinFrappeIntelliJTheme :
    Theme(
        FlatLaf,
        "Catppuccin Frappe",
    ) {
    override fun changeTo() {
        FlatCatppuccinFrappeIJTheme.setup()
    }
}

object FlatLafCatppuccinLatteIntelliJTheme :
    Theme(
        FlatLaf,
        "Catppuccin Latte",
    ) {
    override fun changeTo() {
        FlatCatppuccinLatteIJTheme.setup()
    }
}

object FlatLafCatppuccinMacchiatoIntelliJTheme :
    Theme(
        FlatLaf,
        "Catppuccin Macchiato",
    ) {
    override fun changeTo() {
        FlatCatppuccinMacchiatoIJTheme.setup()
    }
}

object FlatLafCatppuccinMochaIntelliJTheme :
    Theme(
        FlatLaf,
        "Catppuccin Mocha",
    ) {
    override fun changeTo() {
        FlatCatppuccinMochaIJTheme.setup()
    }
}

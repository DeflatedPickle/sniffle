/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import eu.herrn.solarized.SolarizedLookAndFeel
import javax.swing.UIManager

object Solarized : Project("SOLARIZED")

object SolarizedTheme : Theme(
    Solarized,
    "Solarized",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(SolarizedLookAndFeel())
    }
}

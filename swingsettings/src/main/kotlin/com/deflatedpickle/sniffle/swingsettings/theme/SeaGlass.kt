/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.seaglasslookandfeel.SeaGlassLookAndFeel
import javax.swing.UIManager

object SeaGlass : Project("SEAGLASS")

object SeaGlassTheme :
    Theme(
        SeaGlass,
        "SeaGlass",
    ) {
    override fun changeTo() {
        UIManager.setLookAndFeel(SeaGlassLookAndFeel())
    }
}

/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.incors.plaf.kunststoff.KunststoffLookAndFeel
import javax.swing.UIManager

object Kunststoff : Project("KUNSTSTOFF")

object KunststoffTheme : Theme(
    Kunststoff,
    "Kunststoff",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(KunststoffLookAndFeel())
    }
}

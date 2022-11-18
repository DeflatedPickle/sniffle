/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import net.sf.nimrod.NimRODLookAndFeel
import javax.swing.UIManager

object NimROD : Project("NIMROD")

object NimRODTheme : Theme(
    NimROD,
    "NimROD",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(NimRODLookAndFeel())
    }
}

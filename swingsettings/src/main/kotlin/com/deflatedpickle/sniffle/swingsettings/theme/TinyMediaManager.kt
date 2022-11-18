/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import org.tinymediamanager.ui.plaf.dark.TmmDarkLookAndFeel
import org.tinymediamanager.ui.plaf.light.TmmLightLookAndFeel
import javax.swing.UIManager

object TinyMediaManager : Project("TINYMEDIAMANAGER")

object TinyMediaManagerLightTheme : Theme(
    TinyMediaManager,
    "TinyMediaManager Light",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(TmmLightLookAndFeel())
    }
}

object TinyMediaManagerDarkTheme : Theme(
    TinyMediaManager,
    "TinyMediaManager Dark",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(TmmDarkLookAndFeel())
    }
}

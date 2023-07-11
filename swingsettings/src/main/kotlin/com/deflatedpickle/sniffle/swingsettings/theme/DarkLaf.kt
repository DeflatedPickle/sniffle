/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.github.weisj.darklaf.LafManager
import com.github.weisj.darklaf.theme.DarculaTheme
import com.github.weisj.darklaf.theme.HighContrastDarkTheme
import com.github.weisj.darklaf.theme.HighContrastLightTheme
import com.github.weisj.darklaf.theme.IntelliJTheme
import com.github.weisj.darklaf.theme.OneDarkTheme
import com.github.weisj.darklaf.theme.SolarizedDarkTheme
import com.github.weisj.darklaf.theme.SolarizedLightTheme

object DarkLaf : Project("DARKLAF")

object DarkLafDarculaTheme : Theme(DarkLaf, "Darcula") {
    override fun changeTo() {
        LafManager.install(DarculaTheme())
    }
}

object DarkLafHighContrastDarkTheme : Theme(DarkLaf, "High Contrast Dark") {
    override fun changeTo() {
        LafManager.install(HighContrastDarkTheme())
    }
}

object DarkLafHighContrastLightTheme : Theme(DarkLaf, "High Contrast Light") {
    override fun changeTo() {
        LafManager.install(HighContrastLightTheme())
    }
}

object DarkLafIntelliJTheme : Theme(DarkLaf, "IntelliJ") {
    override fun changeTo() {
        LafManager.install(IntelliJTheme())
    }
}

object DarkLafOneDarkTheme : Theme(DarkLaf, "One Dark") {
    override fun changeTo() {
        LafManager.install(OneDarkTheme())
    }
}

object DarkLafSolarizedDarkTheme : Theme(DarkLaf, "Solarized Dark") {
    override fun changeTo() {
        LafManager.install(SolarizedDarkTheme())
    }
}

object DarkLafSolarizedLightTheme : Theme(DarkLaf, "Solarized Light") {
    override fun changeTo() {
        LafManager.install(SolarizedLightTheme())
    }
}

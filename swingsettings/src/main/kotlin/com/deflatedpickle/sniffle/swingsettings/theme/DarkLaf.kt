package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import com.github.weisj.darklaf.LafManager
import com.github.weisj.darklaf.theme.DarculaTheme
import com.github.weisj.darklaf.theme.HighContrastDarkTheme
import com.github.weisj.darklaf.theme.HighContrastLightTheme
import com.github.weisj.darklaf.theme.IntelliJTheme
import com.github.weisj.darklaf.theme.OneDarkTheme
import com.github.weisj.darklaf.theme.SolarizedDarkTheme
import com.github.weisj.darklaf.theme.SolarizedLightTheme
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

object DarkLaf : Project("DARKLAF")

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafDarculaTheme : Theme(
    DarkLaf,
    "Darcula"
) {
    override fun changeTo() {
        LafManager.install(DarculaTheme())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafHighContrastDarkTheme : Theme(
    DarkLaf,
    "High Contrast Dark"
) {
    override fun changeTo() {
        LafManager.install(HighContrastDarkTheme())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafHighContrastLightTheme : Theme(
    DarkLaf,
    "High Contrast Light"
) {
    override fun changeTo() {
        LafManager.install(HighContrastLightTheme())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafIntelliJTheme : Theme(
    DarkLaf,
    "IntelliJ"
) {
    override fun changeTo() {
        LafManager.install(IntelliJTheme())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafOneDarkTheme : Theme(
    DarkLaf,
    "One Dark"
) {
    override fun changeTo() {
        LafManager.install(OneDarkTheme())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafSolarizedDarkTheme : Theme(
    DarkLaf,
    "Solarized Dark"
) {
    override fun changeTo() {
        LafManager.install(SolarizedDarkTheme())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafSolarizedLightTheme : Theme(
    DarkLaf,
    "Solarized Light"
) {
    override fun changeTo() {
        LafManager.install(SolarizedLightTheme())
    }
}
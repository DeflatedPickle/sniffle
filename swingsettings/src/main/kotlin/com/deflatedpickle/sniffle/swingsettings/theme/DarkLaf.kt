package com.deflatedpickle.sniffle.swingsettings.theme

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

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafDarculaTheme : Theme(
    "darklaf_darcula",
    Project.DARKLAF,
    "Darcula"
) {
    override fun changeTo() {
        LafManager.install(DarculaTheme())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafHighContrastDarkTheme : Theme(
    "darklaf_high_contrast_dark",
    Project.DARKLAF,
    "High Contrast Dark"
) {
    override fun changeTo() {
        LafManager.install(HighContrastDarkTheme())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafHighContrastLightTheme : Theme(
    "darklaf_high_contrast_light",
    Project.DARKLAF,
    "High Contrast Light"
) {
    override fun changeTo() {
        LafManager.install(HighContrastLightTheme())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafIntelliJTheme : Theme(
    "darklaf_intellij",
    Project.DARKLAF,
    "IntelliJ"
) {
    override fun changeTo() {
        LafManager.install(IntelliJTheme())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafOneDarkTheme : Theme(
    "darklaf_one_dark",
    Project.DARKLAF,
    "One Dark"
) {
    override fun changeTo() {
        LafManager.install(OneDarkTheme())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafSolarizedDarkTheme : Theme(
    "darklaf_solarized_dark",
    Project.DARKLAF,
    "Solarized Dark"
) {
    override fun changeTo() {
        LafManager.install(SolarizedDarkTheme())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarkLafSolarizedLightTheme : Theme(
    "darklaf_solarized_light",
    Project.DARKLAF,
    "Solarized Light"
) {
    override fun changeTo() {
        LafManager.install(SolarizedLightTheme())
    }
}
package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import eu.herrn.solarized.SolarizedLookAndFeel
import javax.swing.UIManager
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

object Solarized : Project("SOLARIZED")

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object SolarizedTheme : Theme(
    Solarized,
    "Solarized",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(SolarizedLookAndFeel())
    }
}
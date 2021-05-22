/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import eu.herrn.solarized.SolarizedLookAndFeel
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import javax.swing.UIManager

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

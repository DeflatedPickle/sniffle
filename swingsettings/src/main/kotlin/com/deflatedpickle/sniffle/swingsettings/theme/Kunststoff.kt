/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import com.incors.plaf.kunststoff.KunststoffLookAndFeel
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import javax.swing.UIManager

object Kunststoff : Project("KUNSTSTOFF")

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object KunststoffTheme : Theme(
    Kunststoff,
    "Kunststoff",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(KunststoffLookAndFeel())
    }
}

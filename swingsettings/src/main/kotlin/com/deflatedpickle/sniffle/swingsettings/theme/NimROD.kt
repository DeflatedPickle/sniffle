package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import javax.swing.UIManager
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import net.sf.nimrod.NimRODLookAndFeel

object NimROD : Project("NIMROD")

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object NimRODTheme : Theme(
    NimROD,
    "NimROD",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(NimRODLookAndFeel())
    }
}
package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import com.seaglasslookandfeel.SeaGlassLookAndFeel
import javax.swing.UIManager
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

object SeaGlass : Project("SEAGLASS")

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object SeaGlassTheme : Theme(
    SeaGlass,
    "SeaGlass",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(SeaGlassLookAndFeel())
    }
}
package com.deflatedpickle.sniffle.swingsettings.theme

import com.bulenkov.darcula.DarculaLaf
import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import javax.swing.UIManager
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

object Darcula : Project("DARCULA")

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object DarculaTheme : Theme(
    Darcula,
    "Darcula",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(DarculaLaf())
    }
}
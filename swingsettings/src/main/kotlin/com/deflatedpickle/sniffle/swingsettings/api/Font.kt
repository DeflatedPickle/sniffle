package com.deflatedpickle.sniffle.swingsettings.api

import com.deflatedpickle.rawky.settings.widget.ConfigSection
import javax.swing.UIManager
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
data class Font(
    @Required var name: FontFamily = FontFamily(UIManager.getDefaults().getFont("TabbedPane.font").family),
    @Required var style: FontStyle = FontStyle.PLAIN,
    @Required var size: Int = 12
) : ConfigSection
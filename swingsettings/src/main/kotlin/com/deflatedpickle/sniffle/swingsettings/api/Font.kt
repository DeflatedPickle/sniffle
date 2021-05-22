/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.api

import com.deflatedpickle.rawky.settings.widget.ConfigSection
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable
import javax.swing.UIManager

@Serializable
data class Font(
    @Required var name: FontFamily = FontFamily(UIManager.getDefaults().getFont("TabbedPane.font").family),
    @Required var style: FontStyle = FontStyle.PLAIN,
    @Required var size: Int = 12
) : ConfigSection

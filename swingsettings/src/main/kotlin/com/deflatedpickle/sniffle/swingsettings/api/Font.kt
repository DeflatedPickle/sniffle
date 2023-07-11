/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.api

import com.deflatedpickle.haruhi.api.config.ConfigSection
import com.deflatedpickle.rawky.settings.api.range.IntRange
import kotlinx.serialization.Serializable
import javax.swing.UIManager

@Serializable
data class Font(
    var name: FontFamily = FontFamily(UIManager.getDefaults().getFont("TabbedPane.font").family),
    var style: FontStyle = FontStyle.PLAIN,
    @IntRange(1, 36) var size: Int = 12,
) : ConfigSection

/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.api

import com.deflatedpickle.flatlaf.fonts.opendyslexic.FlatOpenDyslexicFont
import com.deflatedpickle.haruhi.api.config.ConfigSection
import com.deflatedpickle.rawky.settings.api.range.IntRange
import kotlinx.serialization.Serializable

@Serializable
data class Font(
    var family: FontFamily = FontFamily(FlatOpenDyslexicFont.FAMILY),
    var style: FontStyle = FontStyle.BOLD,
    @IntRange(1, 36) var size: Int = 12,
) : ConfigSection

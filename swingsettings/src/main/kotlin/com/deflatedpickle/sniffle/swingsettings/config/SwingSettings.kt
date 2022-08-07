/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.config

import com.deflatedpickle.haruhi.api.Config
import com.deflatedpickle.sniffle.swingsettings.api.Font
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.theme.SwingNativeTheme
import kotlinx.serialization.Serializable

@Serializable
data class SwingSettings(
    override val version: Int = 1,
    var theme: Theme = SwingNativeTheme,
    val font: Font = Font()
) : Config

/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.config

import com.deflatedpickle.haruhi.api.config.Config
import com.deflatedpickle.sniffle.swingsettings.api.Font
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.theme.SwingNativeTheme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class SwingSettings(
    override val version: Int = 1,
    val enabled: Boolean = false,
    var theme:
    @Serializable(ThemeSerializer::class)
    Theme = SwingNativeTheme,
    val font: Font = Font(),
) : Config

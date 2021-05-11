package com.deflatedpickle.sniffle.swingsettings.config

import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.theme.ThemeNative
import kotlinx.serialization.Serializable

@Serializable
data class SwingSettings(
    var theme: Theme = ThemeNative
)
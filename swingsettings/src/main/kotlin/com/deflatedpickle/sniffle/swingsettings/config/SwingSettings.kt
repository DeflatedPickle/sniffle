package com.deflatedpickle.sniffle.swingsettings.config

import com.deflatedpickle.sniffle.swingsettings.api.Font
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.theme.SwingNativeTheme
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
data class SwingSettings(
    @Required var theme: Theme = SwingNativeTheme,
    @Required val font: Font = Font()
)
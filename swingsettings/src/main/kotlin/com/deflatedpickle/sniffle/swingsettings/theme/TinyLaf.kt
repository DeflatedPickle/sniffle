package com.deflatedpickle.sniffle.swingsettings.theme

import net.sf.tinylaf.Theme as TinyTheme
import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import com.metsci.glimpse.tinylaf.TinyLafUtils
import javax.swing.UIManager
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import net.sf.tinylaf.TinyLookAndFeel

object TinyLaf : Project("TINYLAF")

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object TinyLafYQTheme : Theme(
    TinyLaf,
    "YQ",
) {
    override fun changeTo() {
        TinyTheme.loadYQTheme()
        // MetalLookAndFeel.setCurrentTheme(TinyDefaultTheme())
        UIManager.setLookAndFeel(TinyLookAndFeel())
    }
}

// The version of TinyLAF used doesn't include any of the usually included themes (I can't find one that does),
// for some reason, but this is some code that would loop and add them all
/*TinyTheme.getAvailableThemes().map {
    object : Theme(
        TinyLaf,
        it.name
    ) {
        override fun changeTo() {
            TinyTheme.loadTheme(it)
            UIManager.setLookAndFeel(TinyLookAndFeel())
        }
    }
}*/

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object TinyLafRadianceTheme : Theme(
    TinyLaf,
    "Radiance",
) {
    override fun changeTo() {
        TinyLafUtils.initTinyLaf()
    }
}

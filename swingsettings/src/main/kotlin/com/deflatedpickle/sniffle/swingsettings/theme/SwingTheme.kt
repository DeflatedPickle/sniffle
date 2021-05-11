@file:Suppress("unused")

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import com.sun.java.swing.plaf.motif.MotifLookAndFeel
import javax.swing.UIManager
import javax.swing.plaf.nimbus.NimbusLookAndFeel
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object ThemeMetal : Theme(
    "swing_metal",
    Project.SWING,
    "Metal",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object ThemeNimbus : Theme(
    "swing_nimbus",
    Project.SWING,
    "Nimbus",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(NimbusLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object ThemeMotif : Theme(
    "swing_motif",
    Project.SWING,
    "Motif",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(MotifLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object ThemeNative : Theme(
    "swing_native",
    Project.SWING,
    "System",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
    }
}
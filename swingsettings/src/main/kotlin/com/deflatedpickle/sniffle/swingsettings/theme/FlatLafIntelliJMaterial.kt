@file:Suppress("SpellCheckingInspection")

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialOceanicContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialOceanicIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMonokaiProContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMonokaiProIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMoonlightContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMoonlightIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedDarkContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedDarkIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedLightContrastIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedLightIJTheme
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialArcDarkTheme : Theme(
    FlatLaf,
    "Arc Dark"
) {
    override fun changeTo() {
        FlatArcDarkIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialArcDarkContrastTheme : Theme(
    FlatLaf,
    "Arc Dark Contrast"
) {
    override fun changeTo() {
        FlatArcDarkContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialOneDarkTheme : Theme(
    FlatLaf,
    "Atom One Dark"
) {
    override fun changeTo() {
        FlatAtomOneDarkIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialOneDarkContrastTheme : Theme(
    FlatLaf,
    "Atom One Dark Contrast"
) {
    override fun changeTo() {
        FlatAtomOneDarkContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialOneLightTheme : Theme(
    FlatLaf,
    "Atom One Light"
) {
    override fun changeTo() {
        FlatAtomOneLightIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialOneLightContrastTheme : Theme(
    FlatLaf,
    "Atom One Light Contrast"
) {
    override fun changeTo() {
        FlatAtomOneLightContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDraculaTheme : Theme(
    FlatLaf,
    "Dracula"
) {
    override fun changeTo() {
        FlatDraculaIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDraculaContrastTheme : Theme(
    FlatLaf,
    "Dracula Contrast"
) {
    override fun changeTo() {
        FlatDraculaContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialGitHubTheme : Theme(
    FlatLaf,
    "GitHub"
) {
    override fun changeTo() {
        FlatGitHubIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialGitHubContrastTheme : Theme(
    FlatLaf,
    "GitHub Contrast"
) {
    override fun changeTo() {
        FlatGitHubContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialLightOwlTheme : Theme(
    FlatLaf,
    "Light Owl"
) {
    override fun changeTo() {
        FlatLightOwlIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialLightOwlContrastTheme : Theme(
    FlatLaf,
    "Light Owl Contrast"
) {
    override fun changeTo() {
        FlatLightOwlContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDarkerTheme : Theme(
    FlatLaf,
    "Material Darker"
) {
    override fun changeTo() {
        FlatMaterialDarkerIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDarkerContrastTheme : Theme(
    FlatLaf,
    "Material Darker Contrast"
) {
    override fun changeTo() {
        FlatMaterialDarkerContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDeepOceanTheme : Theme(
    FlatLaf,
    "Material Deep Ocean"
) {
    override fun changeTo() {
        FlatMaterialDeepOceanIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDeepOceanContrastTheme : Theme(
    FlatLaf,
    "Material Deep Ocean Contrast"
) {
    override fun changeTo() {
        FlatMaterialDeepOceanContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialLighterTheme : Theme(
    FlatLaf,
    "Material Lighter"
) {
    override fun changeTo() {
        FlatMaterialLighterIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialLighterContrastTheme : Theme(
    FlatLaf,
    "Material Lighter Contrast"
) {
    override fun changeTo() {
        FlatMaterialLighterContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialOceanicTheme : Theme(
    FlatLaf,
    "Material Oceanic"
) {
    override fun changeTo() {
        FlatMaterialOceanicIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialOceanicContrastTheme : Theme(
    FlatLaf,
    "Material Oceanic Contrast"
) {
    override fun changeTo() {
        FlatMaterialOceanicContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialPalenightTheme : Theme(
    FlatLaf,
    "Material Palenight"
) {
    override fun changeTo() {
        FlatMaterialPalenightIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialPalenightContrastTheme : Theme(
    FlatLaf,
    "Material Palenight Contrast"
) {
    override fun changeTo() {
        FlatMaterialPalenightContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialMonokaiProTheme : Theme(
    FlatLaf,
    "Monokai Pro"
) {
    override fun changeTo() {
        FlatMonokaiProIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialMonokaiProContrastTheme : Theme(
    FlatLaf,
    "Monokai Pro Contrast"
) {
    override fun changeTo() {
        FlatMonokaiProContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialMoonlightTheme : Theme(
    FlatLaf,
    "Moonlight"
) {
    override fun changeTo() {
        FlatMoonlightIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialMoonlightContrastTheme : Theme(
    FlatLaf,
    "Moonlight Contrast"
) {
    override fun changeTo() {
        FlatMoonlightContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialNightOwlTheme : Theme(
    FlatLaf,
    "Night Owl"
) {
    override fun changeTo() {
        FlatNightOwlIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialNightOwlContrastTheme : Theme(
    FlatLaf,
    "Night Owl Contrast"
) {
    override fun changeTo() {
        FlatNightOwlContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialSolarizedDarkTheme : Theme(
    FlatLaf,
    "Solarized Dark"
) {
    override fun changeTo() {
        FlatSolarizedDarkIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialSolarizedDarkContrastTheme : Theme(
    FlatLaf,
    "Solarized Dark Contrast"
) {
    override fun changeTo() {
        FlatSolarizedDarkContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialSolarizedLightTheme : Theme(
    FlatLaf,
    "Solarized Light"
) {
    override fun changeTo() {
        FlatSolarizedLightIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialSolarizedLightContrastTheme : Theme(
    FlatLaf,
    "Solarized Light Contrast"
) {
    override fun changeTo() {
        FlatSolarizedLightContrastIJTheme.install()
    }
}
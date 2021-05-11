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
    "flatlaf-intellij-material_arc_dark",
    Project.FLATLAF,
    "Arc Dark"
) {
    override fun changeTo() {
        FlatArcDarkIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialArcDarkContrastTheme : Theme(
    "flatlaf-intellij-material_arc_dark_contrast",
    Project.FLATLAF,
    "Arc Dark Contrast"
) {
    override fun changeTo() {
        FlatArcDarkContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialOneDarkTheme : Theme(
    "flatlaf-intellij-material_one_dark",
    Project.FLATLAF,
    "Atom One Dark"
) {
    override fun changeTo() {
        FlatAtomOneDarkIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialOneDarkContrastTheme : Theme(
    "flatlaf-intellij-material_one_dark_contrast",
    Project.FLATLAF,
    "Atom One Dark Contrast"
) {
    override fun changeTo() {
        FlatAtomOneDarkContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialOneLightTheme : Theme(
    "flatlaf-intellij-material_one_light",
    Project.FLATLAF,
    "Atom One Light"
) {
    override fun changeTo() {
        FlatAtomOneLightIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialOneLightContrastTheme : Theme(
    "flatlaf-intellij-material_one_light_contrast",
    Project.FLATLAF,
    "Atom One Light Contrast"
) {
    override fun changeTo() {
        FlatAtomOneLightContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDraculaTheme : Theme(
    "flatlaf-intellij-material_dracula",
    Project.FLATLAF,
    "Dracula"
) {
    override fun changeTo() {
        FlatDraculaIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDraculaContrastTheme : Theme(
    "flatlaf-intellij-material_dracula_contrast",
    Project.FLATLAF,
    "Dracula Contrast"
) {
    override fun changeTo() {
        FlatDraculaContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialGitHubTheme : Theme(
    "flatlaf-intellij-material_github",
    Project.FLATLAF,
    "GitHub"
) {
    override fun changeTo() {
        FlatGitHubIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialGitHubContrastTheme : Theme(
    "flatlaf-intellij-material_github_contrast",
    Project.FLATLAF,
    "GitHub Contrast"
) {
    override fun changeTo() {
        FlatGitHubContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialLightOwlTheme : Theme(
    "flatlaf-intellij-material_light_owl",
    Project.FLATLAF,
    "Light Owl"
) {
    override fun changeTo() {
        FlatLightOwlIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialLightOwlContrastTheme : Theme(
    "flatlaf-intellij-material_light_owl_contrast",
    Project.FLATLAF,
    "Light Owl Contrast"
) {
    override fun changeTo() {
        FlatLightOwlContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDarkerTheme : Theme(
    "flatlaf-intellij-material_darker",
    Project.FLATLAF,
    "Material Darker"
) {
    override fun changeTo() {
        FlatMaterialDarkerIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDarkerContrastTheme : Theme(
    "flatlaf-intellij-material_darker_contrast",
    Project.FLATLAF,
    "Material Darker Contrast"
) {
    override fun changeTo() {
        FlatMaterialDarkerContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDeepOceanTheme : Theme(
    "flatlaf-intellij-material_deep_ocean",
    Project.FLATLAF,
    "Material Deep Ocean"
) {
    override fun changeTo() {
        FlatMaterialDeepOceanIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDeepOceanContrastTheme : Theme(
    "flatlaf-intellij-material_deep_ocean_contrast",
    Project.FLATLAF,
    "Material Deep Ocean Contrast"
) {
    override fun changeTo() {
        FlatMaterialDeepOceanContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialLighterTheme : Theme(
    "flatlaf-intellij-material_lighter",
    Project.FLATLAF,
    "Material Lighter"
) {
    override fun changeTo() {
        FlatMaterialLighterIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialLighterContrastTheme : Theme(
    "flatlaf-intellij-material_lighter_contrast",
    Project.FLATLAF,
    "Material Lighter Contrast"
) {
    override fun changeTo() {
        FlatMaterialLighterContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialOceanicTheme : Theme(
    "flatlaf-intellij-material_oceanic",
    Project.FLATLAF,
    "Material Oceanic"
) {
    override fun changeTo() {
        FlatMaterialOceanicIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialOceanicContrastTheme : Theme(
    "flatlaf-intellij-material_oceanic_contrast",
    Project.FLATLAF,
    "Material Oceanic Contrast"
) {
    override fun changeTo() {
        FlatMaterialOceanicContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialPalenightTheme : Theme(
    "flatlaf-intellij-material_palenight",
    Project.FLATLAF,
    "Material Palenight"
) {
    override fun changeTo() {
        FlatMaterialPalenightIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialPalenightContrastTheme : Theme(
    "flatlaf-intellij-material_palenight_contrast",
    Project.FLATLAF,
    "Material Palenight Contrast"
) {
    override fun changeTo() {
        FlatMaterialPalenightContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialMonokaiProTheme : Theme(
    "flatlaf-intellij-material_monokai_pro",
    Project.FLATLAF,
    "Monokai Pro"
) {
    override fun changeTo() {
        FlatMonokaiProIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialMonokaiProContrastTheme : Theme(
    "flatlaf-intellij-material_monokai_pro_contrast",
    Project.FLATLAF,
    "Monokai Pro Contrast"
) {
    override fun changeTo() {
        FlatMonokaiProContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialMoonlightTheme : Theme(
    "flatlaf-intellij-material_moonlight",
    Project.FLATLAF,
    "Moonlight"
) {
    override fun changeTo() {
        FlatMoonlightIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialMoonlightContrastTheme : Theme(
    "flatlaf-intellij-material_moonlight_contrast",
    Project.FLATLAF,
    "Moonlight Contrast"
) {
    override fun changeTo() {
        FlatMoonlightContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialNightOwlTheme : Theme(
    "flatlaf-intellij-material_night_owl",
    Project.FLATLAF,
    "Night Owl"
) {
    override fun changeTo() {
        FlatNightOwlIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialNightOwlContrastTheme : Theme(
    "flatlaf-intellij-material_night_owl_contrast",
    Project.FLATLAF,
    "Night Owl Contrast"
) {
    override fun changeTo() {
        FlatNightOwlContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialSolarizedDarkTheme : Theme(
    "flatlaf-intellij-material_solarized_dark",
    Project.FLATLAF,
    "Solarized Dark"
) {
    override fun changeTo() {
        FlatSolarizedDarkIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialSolarizedDarkContrastTheme : Theme(
    "flatlaf-intellij-material_solarized_dark_contrast",
    Project.FLATLAF,
    "Solarized Dark Contrast"
) {
    override fun changeTo() {
        FlatSolarizedDarkContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialSolarizedLightTheme : Theme(
    "flatlaf-intellij-material_solarized_light",
    Project.FLATLAF,
    "Solarized Light"
) {
    override fun changeTo() {
        FlatSolarizedLightIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialSolarizedLightContrastTheme : Theme(
    "flatlaf-intellij-material_solarized_light_contrast",
    Project.FLATLAF,
    "Solarized Light Contrast"
) {
    override fun changeTo() {
        FlatSolarizedLightContrastIJTheme.install()
    }
}
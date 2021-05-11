package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme
import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme
import com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDarkFuchsiaIJTheme
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme
import com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme
import com.formdev.flatlaf.intellijthemes.FlatGradiantoNatureGreenIJTheme
import com.formdev.flatlaf.intellijthemes.FlatGrayIJTheme
import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme
import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkMediumIJTheme
import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkSoftIJTheme
import com.formdev.flatlaf.intellijthemes.FlatHiberbeeDarkIJTheme
import com.formdev.flatlaf.intellijthemes.FlatHighContrastIJTheme
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme
import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme
import com.formdev.flatlaf.intellijthemes.FlatMonocaiIJTheme
import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme
import com.formdev.flatlaf.intellijthemes.FlatSolarizedDarkIJTheme
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme
import com.formdev.flatlaf.intellijthemes.FlatSpacegrayIJTheme
import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafArcTheme : Theme(
    "flatlaf-intellij_arc",
    Project.FLATLAF,
    "Arc",
) {
    override fun changeTo() {
        FlatArcIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafArcOrangeTheme : Theme(
    "flatlaf-intellij_arc_orange",
    Project.FLATLAF,
    "Arc Orange",
) {
    override fun changeTo() {
        FlatArcOrangeIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafArcDarkTheme : Theme(
    "flatlaf-intellij_arc_dark",
    Project.FLATLAF,
    "Arc Dark",
) {
    override fun changeTo() {
        FlatArcDarkIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafArcDarkOrangeTheme : Theme(
    "flatlaf-intellij_arc_dark_orange",
    Project.FLATLAF,
    "Arc Dark Orange",
) {
    override fun changeTo() {
        FlatArcDarkOrangeIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafCarbonTheme : Theme(
    "flatlaf-intellij_carbon",
    Project.FLATLAF,
    "Carbon",
) {
    override fun changeTo() {
        FlatCarbonIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafCobalt2Theme : Theme(
    "flatlaf-intellij_cobalt_2",
    Project.FLATLAF,
    "Cobalt 2",
) {
    override fun changeTo() {
        FlatCobalt2IJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafCyanLightTheme : Theme(
    "flatlaf-intellij_cyan_light",
    Project.FLATLAF,
    "Cyan Light",
) {
    override fun changeTo() {
        FlatCyanLightIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafDarkFlatTheme : Theme(
    "flatlaf-intellij_dark_flat",
    Project.FLATLAF,
    "Dark Flat",
) {
    override fun changeTo() {
        FlatDarkFlatIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafDarkPurpleTheme : Theme(
    "flatlaf-intellij_dark_purple",
    Project.FLATLAF,
    "Dark Purple",
) {
    override fun changeTo() {
        FlatDarkPurpleIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafDraculaTheme : Theme(
    "flatlaf-intellij_dracula",
    Project.FLATLAF,
    "Dracula",
) {
    override fun changeTo() {
        FlatDraculaIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafGradiantoDarkFuchsiaTheme : Theme(
    "flatlaf-intellij_gradianto_dark_fuchsia",
    Project.FLATLAF,
    "Gradianto Dark Fuchsia",
) {
    override fun changeTo() {
        FlatGradiantoDarkFuchsiaIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafGradiantoDeepOceanTheme : Theme(
    "flatlaf-intellij_gradianto_deep_ocean",
    Project.FLATLAF,
    "Gradianto Deep Ocean",
) {
    override fun changeTo() {
        FlatGradiantoDeepOceanIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafGradiantoMidnightBlueTheme : Theme(
    "flatlaf-intellij_gradianto_midnight_blue",
    Project.FLATLAF,
    "Gradianto Midnight Blue",
) {
    override fun changeTo() {
        FlatGradiantoMidnightBlueIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafGradiantoNatureGreenTheme : Theme(
    "flatlaf-intellij_gradianto_nature_green",
    Project.FLATLAF,
    "Gradianto Nature Green",
) {
    override fun changeTo() {
        FlatGradiantoNatureGreenIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafGrayTheme : Theme(
    "flatlaf-intellij_gray",
    Project.FLATLAF,
    "Gray",
) {
    override fun changeTo() {
        FlatGrayIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafGruvboxDarkHardTheme : Theme(
    "flatlaf-intellij_gruvbox_dark_hard",
    Project.FLATLAF,
    "Gruvbox Dark Hard",
) {
    override fun changeTo() {
        FlatGruvboxDarkHardIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafGruvboxDarkMediumTheme : Theme(
    "flatlaf-intellij_gruvbox_dark_medium",
    Project.FLATLAF,
    "Gruvbox Dark Medium",
) {
    override fun changeTo() {
        FlatGruvboxDarkMediumIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafGruvboxDarkSoftTheme : Theme(
    "flatlaf-intellij_gruvbox_dark_soft",
    Project.FLATLAF,
    "Gruvbox Dark Soft",
) {
    override fun changeTo() {
        FlatGruvboxDarkSoftIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafHiberbeeDarkTheme : Theme(
    "flatlaf-intellij_hiberbee_dark",
    Project.FLATLAF,
    "Hiberbee Dark",
) {
    override fun changeTo() {
        FlatHiberbeeDarkIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafHighContrastTheme : Theme(
    "flatlaf-intellij_high_contrast",
    Project.FLATLAF,
    "High Contrast",
) {
    override fun changeTo() {
        FlatHighContrastIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafLightFlatTheme : Theme(
    "flatlaf-intellij_light_flat",
    Project.FLATLAF,
    "Light Flat"
) {
    override fun changeTo() {
        FlatLightFlatIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMaterialDesignDarkTheme : Theme(
    "flatlaf-intellij_material_design_dark",
    Project.FLATLAF,
    "Material Design Dark",
) {
    override fun changeTo() {
        FlatMaterialDesignDarkIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafMonocaiTheme : Theme(
    "flatlaf-intellij_monocai",
    Project.FLATLAF,
    "Monocai",
) {
    override fun changeTo() {
        FlatMonocaiIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafNordTheme : Theme(
    "flatlaf-intellij_nord",
    Project.FLATLAF,
    "Nord",
) {
    override fun changeTo() {
        FlatNordIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafOneDarkTheme : Theme(
    "flatlaf-intellij_one_dark",
    Project.FLATLAF,
    "One Dark",
) {
    override fun changeTo() {
        FlatOneDarkIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafSolarizedDarkTheme : Theme(
    "flatlaf-intellij_solarized_dark",
    Project.FLATLAF,
    "Solarized Dark",
) {
    override fun changeTo() {
        FlatSolarizedDarkIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafSolarizedLightTheme : Theme(
    "flatlaf-intellij_solarized_light",
    Project.FLATLAF,
    "Solarized Light",
) {
    override fun changeTo() {
        FlatSolarizedLightIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafSpaceGrayTheme : Theme(
    "flatlaf-intellij_spacegray",
    Project.FLATLAF,
    "Spacegray",
) {
    override fun changeTo() {
        FlatSpacegrayIJTheme.install()
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object FlatLafVuesionTheme : Theme(
    "flatlaf-intellij_vuesion",
    Project.FLATLAF,
    "Vuesion",
) {
    override fun changeTo() {
        FlatVuesionIJTheme.install()
    }
}
/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Theme
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
import com.formdev.flatlaf.intellijthemes.FlatMonokaiProIJTheme
import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme
import com.formdev.flatlaf.intellijthemes.FlatSolarizedDarkIJTheme
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme
import com.formdev.flatlaf.intellijthemes.FlatSpacegrayIJTheme
import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme
import com.formdev.flatlaf.intellijthemes.FlatXcodeDarkIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme

object FlatLafArcDarkTheme :
    Theme(
        "flatlaf-intellij_arc_dark",
        FlatLaf,
        "Arc Dark",
    ) {
    override fun changeTo() {
        FlatArcDarkIJTheme.setup()
    }
}

object FlatLafArcDarkOrangeTheme :
    Theme(
        "flatlaf-intellij_arc_dark_orange",
        FlatLaf,
        "Arc Dark Orange",
    ) {
    override fun changeTo() {
        FlatArcDarkOrangeIJTheme.setup()
    }
}

object FlatLafArcTheme :
    Theme(
        "flatlaf-intellij_arc",
        FlatLaf,
        "Arc",
    ) {
    override fun changeTo() {
        FlatArcIJTheme.setup()
    }
}

object FlatLafArcOrangeTheme :
    Theme(
        "flatlaf-intellij_arc_orange",
        FlatLaf,
        "Arc Orange",
    ) {
    override fun changeTo() {
        FlatArcOrangeIJTheme.setup()
    }
}

object FlatLafCarbonTheme :
    Theme(
        "flatlaf-intellij_carbon",
        FlatLaf,
        "Carbon",
    ) {
    override fun changeTo() {
        FlatCarbonIJTheme.setup()
    }
}

object FlatLafCobalt2Theme :
    Theme(
        "flatlaf-intellij_cobalt_2",
        FlatLaf,
        "Cobalt 2",
    ) {
    override fun changeTo() {
        FlatCobalt2IJTheme.setup()
    }
}

object FlatLafCyanLightTheme :
    Theme(
        "flatlaf-intellij_cyan_light",
        FlatLaf,
        "Cyan Light",
    ) {
    override fun changeTo() {
        FlatCyanLightIJTheme.setup()
    }
}

object FlatLafDarkFlatTheme :
    Theme(
        "flatlaf-intellij_dark_flat",
        FlatLaf,
        "Dark Flat",
    ) {
    override fun changeTo() {
        FlatDarkFlatIJTheme.setup()
    }
}

object FlatLafDarkPurpleTheme :
    Theme(
        "flatlaf-intellij_dark_purple",
        FlatLaf,
        "Dark Purple",
    ) {
    override fun changeTo() {
        FlatDarkPurpleIJTheme.setup()
    }
}

object FlatLafDraculaTheme :
    Theme(
        "flatlaf-intellij_dracula",
        FlatLaf,
        "Dracula",
    ) {
    override fun changeTo() {
        FlatDraculaIJTheme.setup()
    }
}

object FlatLafGradiantoDarkFuchsiaTheme :
    Theme(
        "flatlaf-intellij_gradianto_dark_fuchsia",
        FlatLaf,
        "Gradianto Dark Fuchsia",
    ) {
    override fun changeTo() {
        FlatGradiantoDarkFuchsiaIJTheme.setup()
    }
}

object FlatLafGradiantoDeepOceanTheme :
    Theme(
        "flatlaf-intellij_gradianto_deep_ocean",
        FlatLaf,
        "Gradianto Deep Ocean",
    ) {
    override fun changeTo() {
        FlatGradiantoDeepOceanIJTheme.setup()
    }
}

object FlatLafGradiantoMidnightBlueTheme :
    Theme(
        "flatlaf-intellij_gradianto_midnight_blue",
        FlatLaf,
        "Gradianto Midnight Blue",
    ) {
    override fun changeTo() {
        FlatGradiantoMidnightBlueIJTheme.setup()
    }
}

object FlatLafGradiantoNatureGreenTheme :
    Theme(
        "flatlaf-intellij_gradianto_nature_green",
        FlatLaf,
        "Gradianto Nature Green",
    ) {
    override fun changeTo() {
        FlatGradiantoNatureGreenIJTheme.setup()
    }
}

object FlatLafGrayTheme :
    Theme(
        "flatlaf-intellij_gray",
        FlatLaf,
        "Gray",
    ) {
    override fun changeTo() {
        FlatGrayIJTheme.setup()
    }
}

object FlatLafGruvboxDarkHardTheme :
    Theme(
        "flatlaf-intellij_gruvbox_dark_hard",
        FlatLaf,
        "Gruvbox Dark Hard",
    ) {
    override fun changeTo() {
        FlatGruvboxDarkHardIJTheme.setup()
    }
}

object FlatLafGruvboxDarkMediumTheme :
    Theme(
        "flatlaf-intellij_gruvbox_dark_medium",
        FlatLaf,
        "Gruvbox Dark Medium",
    ) {
    override fun changeTo() {
        FlatGruvboxDarkMediumIJTheme.setup()
    }
}

object FlatLafGruvboxDarkSoftTheme :
    Theme(
        "flatlaf-intellij_gruvbox_dark_soft",
        FlatLaf,
        "Gruvbox Dark Soft",
    ) {
    override fun changeTo() {
        FlatGruvboxDarkSoftIJTheme.setup()
    }
}

object FlatLafHiberbeeDarkTheme :
    Theme(
        "flatlaf-intellij_hiberbee_dark",
        FlatLaf,
        "Hiberbee Dark",
    ) {
    override fun changeTo() {
        FlatHiberbeeDarkIJTheme.setup()
    }
}

object FlatLafHighContrastTheme :
    Theme(
        "flatlaf-intellij_high_contrast",
        FlatLaf,
        "High Contrast",
    ) {
    override fun changeTo() {
        FlatHighContrastIJTheme.setup()
    }
}

object FlatLafLightFlatTheme : Theme("flatlaf-intellij_light_flat", FlatLaf, "Light Flat") {
    override fun changeTo() {
        FlatLightFlatIJTheme.setup()
    }
}

object FlatLafMaterialDesignDarkTheme :
    Theme(
        "flatlaf-intellij_material_design_dark",
        FlatLaf,
        "Material Design Dark",
    ) {
    override fun changeTo() {
        FlatMaterialDesignDarkIJTheme.setup()
    }
}

object FlatLafMonocaiTheme :
    Theme(
        "flatlaf-intellij_monocai",
        FlatLaf,
        "Monocai",
    ) {
    override fun changeTo() {
        FlatMonocaiIJTheme.setup()
    }
}

object FlatLafMonokaiProTheme :
    Theme(
        "flatlaf-intellij_monokai_pro",
        FlatLaf,
        "Monocai",
    ) {
    override fun changeTo() {
        FlatMonokaiProIJTheme.setup()
    }
}

object FlatLafNordTheme :
    Theme(
        "flatlaf-intellij_nord",
        FlatLaf,
        "Nord",
    ) {
    override fun changeTo() {
        FlatNordIJTheme.setup()
    }
}

object FlatLafOneDarkTheme :
    Theme(
        "flatlaf-intellij_one_dark",
        FlatLaf,
        "One Dark",
    ) {
    override fun changeTo() {
        FlatOneDarkIJTheme.setup()
    }
}

object FlatLafSolarizedDarkTheme :
    Theme(
        "flatlaf-intellij_solarized_dark",
        FlatLaf,
        "Solarized Dark",
    ) {
    override fun changeTo() {
        FlatSolarizedDarkIJTheme.setup()
    }
}

object FlatLafSolarizedLightTheme :
    Theme(
        "flatlaf-intellij_solarized_light",
        FlatLaf,
        "Solarized Light",
    ) {
    override fun changeTo() {
        FlatSolarizedLightIJTheme.setup()
    }
}

object FlatLafSpaceGrayTheme :
    Theme(
        "flatlaf-intellij_spacegray",
        FlatLaf,
        "Spacegray",
    ) {
    override fun changeTo() {
        FlatSpacegrayIJTheme.setup()
    }
}

object FlatLafVuesionTheme :
    Theme(
        "flatlaf-intellij_vuesion",
        FlatLaf,
        "Vuesion",
    ) {
    override fun changeTo() {
        FlatVuesionIJTheme.setup()
    }
}

object FlatLafXCodeTheme :
    Theme(
        "flatlaf-intellij_xcode",
        FlatLaf,
        "XCode",
    ) {
    override fun changeTo() {
        FlatXcodeDarkIJTheme.setup()
    }
}

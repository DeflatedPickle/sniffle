/* Copyright (c) 2021 DeflatedPickle under the MIT license */

@file:Suppress("SpellCheckingInspection")

package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialOceanicIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMonokaiProIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMoonlightIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedDarkIJTheme
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedLightIJTheme

object FlatLafMaterialArcDarkTheme : Theme(FlatLaf, "Arc Dark") {
    override fun changeTo() {
        FlatArcDarkIJTheme.setup()
    }
}

object FlatLafMaterialOneDarkTheme : Theme(FlatLaf, "Atom One Dark") {
    override fun changeTo() {
        FlatAtomOneDarkIJTheme.setup()
    }
}

object FlatLafMaterialOneLightTheme : Theme(FlatLaf, "Atom One Light") {
    override fun changeTo() {
        FlatAtomOneLightIJTheme.setup()
    }
}

object FlatLafMaterialDraculaTheme : Theme(FlatLaf, "Dracula") {
    override fun changeTo() {
        FlatDraculaIJTheme.setup()
    }
}

object FlatLafMaterialGitHubTheme : Theme(FlatLaf, "GitHub") {
    override fun changeTo() {
        FlatGitHubIJTheme.setup()
    }
}

object FlatLafMaterialLightOwlTheme : Theme(FlatLaf, "Light Owl") {
    override fun changeTo() {
        FlatLightOwlIJTheme.setup()
    }
}

object FlatLafMaterialDarkerTheme : Theme(FlatLaf, "Material Darker") {
    override fun changeTo() {
        FlatMaterialDarkerIJTheme.setup()
    }
}

object FlatLafMaterialDeepOceanTheme : Theme(FlatLaf, "Material Deep Ocean") {
    override fun changeTo() {
        FlatMaterialDeepOceanIJTheme.setup()
    }
}

object FlatLafMaterialLighterTheme : Theme(FlatLaf, "Material Lighter") {
    override fun changeTo() {
        FlatMaterialLighterIJTheme.setup()
    }
}

object FlatLafMaterialOceanicTheme : Theme(FlatLaf, "Material Oceanic") {
    override fun changeTo() {
        FlatMaterialOceanicIJTheme.setup()
    }
}

object FlatLafMaterialPalenightTheme : Theme(FlatLaf, "Material Palenight") {
    override fun changeTo() {
        FlatMaterialPalenightIJTheme.setup()
    }
}

object FlatLafMaterialMonokaiProTheme : Theme(FlatLaf, "Monokai Pro") {
    override fun changeTo() {
        FlatMonokaiProIJTheme.setup()
    }
}

object FlatLafMaterialMoonlightTheme : Theme(FlatLaf, "Moonlight") {
    override fun changeTo() {
        FlatMoonlightIJTheme.setup()
    }
}

object FlatLafMaterialNightOwlTheme : Theme(FlatLaf, "Night Owl") {
    override fun changeTo() {
        FlatNightOwlIJTheme.setup()
    }
}

object FlatLafMaterialSolarizedDarkTheme : Theme(FlatLaf, "Solarized Dark") {
    override fun changeTo() {
        FlatSolarizedDarkIJTheme.setup()
    }
}

object FlatLafMaterialSolarizedLightTheme : Theme(FlatLaf, "Solarized Light") {
    override fun changeTo() {
        FlatSolarizedLightIJTheme.setup()
    }
}

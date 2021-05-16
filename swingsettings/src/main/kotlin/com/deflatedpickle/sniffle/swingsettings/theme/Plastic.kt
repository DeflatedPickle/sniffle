package com.deflatedpickle.sniffle.swingsettings.theme

import com.deflatedpickle.sniffle.swingsettings.api.Project
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import com.jgoodies.plaf.plastic.Plastic3DLookAndFeel
import com.jgoodies.plaf.plastic.PlasticXPLookAndFeel
import com.jgoodies.plaf.plastic.theme.BrownSugar
import com.jgoodies.plaf.plastic.theme.DarkStar
import com.jgoodies.plaf.plastic.theme.DesertBlue
import com.jgoodies.plaf.plastic.theme.DesertBluer
import com.jgoodies.plaf.plastic.theme.DesertGreen
import com.jgoodies.plaf.plastic.theme.DesertRed
import com.jgoodies.plaf.plastic.theme.DesertYellow
import com.jgoodies.plaf.plastic.theme.ExperienceBlue
import com.jgoodies.plaf.plastic.theme.ExperienceGreen
import com.jgoodies.plaf.plastic.theme.Silver
import com.jgoodies.plaf.plastic.theme.SkyBlue
import com.jgoodies.plaf.plastic.theme.SkyBluer
import com.jgoodies.plaf.plastic.theme.SkyBluerTahoma
import com.jgoodies.plaf.plastic.theme.SkyGreen
import com.jgoodies.plaf.plastic.theme.SkyKrupp
import com.jgoodies.plaf.plastic.theme.SkyPink
import com.jgoodies.plaf.plastic.theme.SkyRed
import com.jgoodies.plaf.plastic.theme.SkyYellow
import javax.swing.UIManager
import javax.swing.plaf.metal.MetalLookAndFeel
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

object Plastic : Project("PLASTIC")

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticBrownSugarTheme : Theme(
    Plastic,
    "Brown Sugar",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(BrownSugar())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticDarkStarTheme : Theme(
    Plastic,
    "Dark Star",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(DarkStar())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticDesertBlueTheme : Theme(
    Plastic,
    "Desert Blue",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(DesertBlue())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticDesertBluerTheme : Theme(
    Plastic,
    "Desert Bluer",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(DesertBluer())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticDesertGreenTheme : Theme(
    Plastic,
    "Desert Green",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(DesertGreen())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticDesertRedTheme : Theme(
    Plastic,
    "Desert Red",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(DesertRed())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticDesertYellowTheme : Theme(
    Plastic,
    "Desert Yellow",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(DesertYellow())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticExperienceBlueTheme : Theme(
    Plastic,
    "Experience Blue",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(ExperienceBlue())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticExperienceGreenTheme : Theme(
    Plastic,
    "Experience Green",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(ExperienceGreen())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticSilverTheme : Theme(
    Plastic,
    "Silver",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(Silver())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticSkyBlueTheme : Theme(
    Plastic,
    "Sky Blue",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(SkyBlue())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticSkyBluerTheme : Theme(
    Plastic,
    "Sky Bluer",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(SkyBluer())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticSkyBluerTahomaTheme : Theme(
    Plastic,
    "Sky Bluer Tahoma",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(SkyBluerTahoma())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticSkyGreenTheme : Theme(
    Plastic,
    "Sky Green",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(SkyGreen())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticSkyKruppTheme : Theme(
    Plastic,
    "Sky Krupp",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(SkyKrupp())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticSkyPinkTheme : Theme(
    Plastic,
    "Sky Pink",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(SkyPink())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticSkyRedTheme : Theme(
    Plastic,
    "Sky Red",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(SkyRed())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticSkyYellowTheme : Theme(
    Plastic,
    "Sky Yellow",
) {
    override fun changeTo() {
        MetalLookAndFeel.setCurrentTheme(SkyYellow())
        UIManager.setLookAndFeel(MetalLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object Plastic3DTheme : Theme(
    Plastic,
    "3D",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(Plastic3DLookAndFeel())
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
object PlasticXPTheme : Theme(
    Plastic,
    "XP",
) {
    override fun changeTo() {
        UIManager.setLookAndFeel(PlasticXPLookAndFeel())
    }
}
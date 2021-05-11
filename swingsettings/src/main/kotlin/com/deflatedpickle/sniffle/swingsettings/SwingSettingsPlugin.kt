/* Copyright (c) 2020-2021 DeflatedPickle under the MIT license */

@file:Suppress("UNCHECKED_CAST")

package com.deflatedpickle.sniffle.swingsettings

import com.deflatedpickle.haruhi.api.Registry
import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.api.plugin.PluginType
import com.deflatedpickle.haruhi.event.EventProgramFinishSetup
import com.deflatedpickle.haruhi.util.ConfigUtil
import com.deflatedpickle.haruhi.util.RegistryUtil
import com.deflatedpickle.marvin.extensions.get
import com.deflatedpickle.marvin.extensions.set
import com.deflatedpickle.rawky.settings.SettingsGUI
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.config.SwingSettings
import com.deflatedpickle.sniffle.swingsettings.theme.DarculaTheme
import com.deflatedpickle.sniffle.swingsettings.theme.DarkLafDarculaTheme
import com.deflatedpickle.sniffle.swingsettings.theme.DarkLafHighContrastDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.DarkLafHighContrastLightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.DarkLafIntelliJTheme
import com.deflatedpickle.sniffle.swingsettings.theme.DarkLafOneDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.DarkLafSolarizedDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.DarkLafSolarizedLightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafArcDarkOrangeTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafArcDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafArcOrangeTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafArcTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafCarbonTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafCobalt2Theme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafCyanLightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafDarculaTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafDarkFlatTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafDarkPurpleTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafDraculaTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafGradiantoDarkFuchsiaTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafGradiantoDeepOceanTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafGradiantoMidnightBlueTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafGradiantoNatureGreenTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafGrayTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafGruvboxDarkHardTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafGruvboxDarkMediumTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafGruvboxDarkSoftTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafHiberbeeDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafHighContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafIntelliJTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafLightFlatTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafLightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialArcDarkContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialArcDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialDarkerContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialDarkerTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialDeepOceanContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialDeepOceanTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialDesignDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialDraculaContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialDraculaTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialGitHubContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialGitHubTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialLightOwlContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialLightOwlTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialLighterContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialLighterTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialMonokaiProContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialMonokaiProTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialMoonlightContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialMoonlightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialNightOwlContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialNightOwlTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialOceanicContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialOceanicTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialOneDarkContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialOneDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialOneLightContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialOneLightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialPalenightContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialPalenightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialSolarizedDarkContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialSolarizedDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialSolarizedLightContrastTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialSolarizedLightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMonocaiTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafNordTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafOneDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafSolarizedDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafSolarizedLightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafSpaceGrayTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafVuesionTheme
import com.deflatedpickle.sniffle.swingsettings.theme.ThemeMetal
import com.deflatedpickle.sniffle.swingsettings.theme.ThemeMotif
import com.deflatedpickle.sniffle.swingsettings.theme.ThemeNative
import com.deflatedpickle.sniffle.swingsettings.theme.ThemeNimbus
import java.awt.Component
import java.awt.Window
import javax.swing.JComboBox
import javax.swing.SwingUtilities

@Plugin(
    value = "swing_settings",
    author = "DeflatedPickle",
    version = "1.0.0",
    description = """
        <br>
        Settings for Swing
    """,
    type = PluginType.SETTING,
    dependencies = [
        "deflatedpickle@settings_gui#>=1.0.0"
    ],
    settings = SwingSettings::class
)
@Suppress("unused")
object SwingSettingsPlugin {
    init {
        val themeRegistry = Registry<String, Theme>()
        RegistryUtil.register("theme", themeRegistry)

        themeRegistry.apply {
            register(ThemeMetal.id, ThemeMetal)
            register(ThemeNimbus.id, ThemeNimbus)
            register(ThemeMotif.id, ThemeMotif)
            register(ThemeNative.id, ThemeNative)

            register(DarculaTheme.id, DarculaTheme)

            // register(ThemeMaterialLight.name, ThemeMaterialLight)
            // register(ThemeMaterialOceanic.name, ThemeMaterialOceanic)
            // register(ThemeJMarsDark.name, ThemeJMarsDark)

            // register(WebTheme.name, WebTheme)

            register(FlatLafLightTheme.id, FlatLafLightTheme)
            register(FlatLafDarkTheme.id, FlatLafDarkTheme)
            register(FlatLafIntelliJTheme.id, FlatLafIntelliJTheme)
            register(FlatLafDarculaTheme.id, FlatLafDarculaTheme)

            register(FlatLafArcTheme.id, FlatLafArcTheme)
            register(FlatLafArcOrangeTheme.id, FlatLafArcOrangeTheme)
            register(FlatLafArcDarkTheme.id, FlatLafArcDarkTheme)
            register(FlatLafArcDarkOrangeTheme.id, FlatLafArcDarkOrangeTheme)
            register(FlatLafCarbonTheme.id, FlatLafCarbonTheme)
            register(FlatLafCobalt2Theme.id, FlatLafCobalt2Theme)
            register(FlatLafCyanLightTheme.id, FlatLafCyanLightTheme)
            register(FlatLafDarkFlatTheme.id, FlatLafDarkFlatTheme)
            register(FlatLafDarkPurpleTheme.id, FlatLafDarkPurpleTheme)
            register(FlatLafDraculaTheme.id, FlatLafDraculaTheme)
            register(FlatLafGradiantoDarkFuchsiaTheme.id, FlatLafGradiantoDarkFuchsiaTheme)
            register(FlatLafGradiantoDeepOceanTheme.id, FlatLafGradiantoDeepOceanTheme)
            register(FlatLafGradiantoMidnightBlueTheme.id, FlatLafGradiantoMidnightBlueTheme)
            register(FlatLafGradiantoNatureGreenTheme.id, FlatLafGradiantoNatureGreenTheme)
            register(FlatLafGrayTheme.id, FlatLafGrayTheme)
            register(FlatLafGruvboxDarkHardTheme.id, FlatLafGruvboxDarkHardTheme)
            register(FlatLafGruvboxDarkMediumTheme.id, FlatLafGruvboxDarkMediumTheme)
            register(FlatLafGruvboxDarkSoftTheme.id, FlatLafGruvboxDarkSoftTheme)
            register(FlatLafHiberbeeDarkTheme.id, FlatLafHiberbeeDarkTheme)
            register(FlatLafHighContrastTheme.id, FlatLafHighContrastTheme)
            register(FlatLafLightFlatTheme.id, FlatLafLightFlatTheme)
            register(FlatLafMaterialDesignDarkTheme.id, FlatLafMaterialDesignDarkTheme)
            register(FlatLafMonocaiTheme.id, FlatLafMonocaiTheme)
            register(FlatLafNordTheme.id, FlatLafNordTheme)
            register(FlatLafOneDarkTheme.id, FlatLafOneDarkTheme)
            register(FlatLafSolarizedDarkTheme.id, FlatLafSolarizedDarkTheme)
            register(FlatLafSolarizedLightTheme.id, FlatLafSolarizedLightTheme)
            register(FlatLafSpaceGrayTheme.id, FlatLafSpaceGrayTheme)
            register(FlatLafVuesionTheme.id, FlatLafVuesionTheme)

            register(FlatLafMaterialArcDarkTheme.id, FlatLafMaterialArcDarkTheme)
            register(FlatLafMaterialArcDarkContrastTheme.id, FlatLafMaterialArcDarkContrastTheme)
            register(FlatLafMaterialOneDarkTheme.id, FlatLafMaterialOneDarkTheme)
            register(FlatLafMaterialOneDarkContrastTheme.id, FlatLafMaterialOneDarkContrastTheme)
            register(FlatLafMaterialOneLightTheme.id, FlatLafMaterialOneLightTheme)
            register(FlatLafMaterialOneLightContrastTheme.id, FlatLafMaterialOneLightContrastTheme)
            register(FlatLafMaterialDraculaTheme.id, FlatLafMaterialDraculaTheme)
            register(FlatLafMaterialDraculaContrastTheme.id, FlatLafMaterialDraculaContrastTheme)
            register(FlatLafMaterialGitHubTheme.id, FlatLafMaterialGitHubTheme)
            register(FlatLafMaterialGitHubContrastTheme.id, FlatLafMaterialGitHubContrastTheme)
            register(FlatLafMaterialLightOwlTheme.id, FlatLafMaterialLightOwlTheme)
            register(FlatLafMaterialLightOwlContrastTheme.id, FlatLafMaterialLightOwlContrastTheme)
            register(FlatLafMaterialDarkerTheme.id, FlatLafMaterialDarkerTheme)
            register(FlatLafMaterialDarkerContrastTheme.id, FlatLafMaterialDarkerContrastTheme)
            register(FlatLafMaterialDeepOceanTheme.id, FlatLafMaterialDeepOceanTheme)
            register(FlatLafMaterialDeepOceanContrastTheme.id, FlatLafMaterialDeepOceanContrastTheme)
            register(FlatLafMaterialLighterTheme.id, FlatLafMaterialLighterTheme)
            register(FlatLafMaterialLighterContrastTheme.id, FlatLafMaterialLighterContrastTheme)
            register(FlatLafMaterialOceanicTheme.id, FlatLafMaterialOceanicTheme)
            register(FlatLafMaterialOceanicContrastTheme.id, FlatLafMaterialOceanicContrastTheme)
            register(FlatLafMaterialPalenightTheme.id, FlatLafMaterialPalenightTheme)
            register(FlatLafMaterialPalenightContrastTheme.id, FlatLafMaterialPalenightContrastTheme)
            register(FlatLafMaterialMonokaiProTheme.id, FlatLafMaterialMonokaiProTheme)
            register(FlatLafMaterialMonokaiProContrastTheme.id, FlatLafMaterialMonokaiProContrastTheme)
            register(FlatLafMaterialMoonlightTheme.id, FlatLafMaterialMoonlightTheme)
            register(FlatLafMaterialMoonlightContrastTheme.id, FlatLafMaterialMoonlightContrastTheme)
            register(FlatLafMaterialNightOwlTheme.id, FlatLafMaterialNightOwlTheme)
            register(FlatLafMaterialNightOwlContrastTheme.id, FlatLafMaterialNightOwlContrastTheme)
            register(FlatLafMaterialSolarizedDarkTheme.id, FlatLafMaterialSolarizedDarkTheme)
            register(FlatLafMaterialSolarizedDarkContrastTheme.id, FlatLafMaterialSolarizedDarkContrastTheme)
            register(FlatLafMaterialSolarizedLightTheme.id, FlatLafMaterialSolarizedLightTheme)
            register(FlatLafMaterialSolarizedLightContrastTheme.id, FlatLafMaterialSolarizedLightContrastTheme)

            register(DarkLafDarculaTheme.id, DarkLafDarculaTheme)
            register(DarkLafHighContrastDarkTheme.id, DarkLafHighContrastDarkTheme)
            register(DarkLafHighContrastLightTheme.id, DarkLafHighContrastLightTheme)
            register(DarkLafIntelliJTheme.id, DarkLafIntelliJTheme)
            register(DarkLafOneDarkTheme.id, DarkLafOneDarkTheme)
            register(DarkLafSolarizedDarkTheme.id, DarkLafSolarizedDarkTheme)
            register(DarkLafSolarizedLightTheme.id, DarkLafSolarizedLightTheme)

            /*register(SubstanceBusinessTheme.id, SubstanceBusinessTheme)
            register(SubstanceBusinessBlueSteelTheme.id, SubstanceBusinessBlueSteelTheme)
            register(SubstanceCremeTheme.id, SubstanceCremeTheme)
            register(SubstanceCremeCoffeeTheme.id, SubstanceCremeCoffeeTheme)
            register(SubstanceSaharaTheme.id, SubstanceSaharaTheme)
            register(SubstanceNebulaTheme.id, SubstanceNebulaTheme)
            register(SubstanceAutumnTheme.id, SubstanceAutumnTheme)
            register(SubstanceMistSilverTheme.id, SubstanceMistSilverTheme)
            register(SubstanceMistAquaTheme.id, SubstanceMistAquaTheme)
            register(SubstanceDustTheme.id, SubstanceDustTheme)
            register(SubstanceDustCoffeeTheme.id, SubstanceDustCoffeeTheme)
            register(SubstanceGeminiTheme.id, SubstanceGeminiTheme)
            register(SubstanceMarinerTheme.id, SubstanceMarinerTheme)
            register(SubstanceCeruleanTheme.id, SubstanceCeruleanTheme)
            register(SubstanceOfficeSilverTheme.id, SubstanceOfficeSilverTheme)
            register(SubstanceOfficeBlueTheme.id, SubstanceOfficeBlueTheme)
            register(SubstanceOfficeBlackTheme.id, SubstanceOfficeBlackTheme)*/
        }

        EventProgramFinishSetup.addListener {
            // val themeRegistry = Registry<String, com.deflatedpickle.sniffle.swingsettings.api.Theme>()

            (RegistryUtil.get("setting_type") as Registry<String, (Plugin, String, Any) -> Component>?)?.let { registry ->
                registry.register(Theme::class.qualifiedName!!) { plugin, name, instance ->
                    // Theme::class.sealedSubclasses.map { it.objectInstance as Theme }.toTypedArray()
                    JComboBox(themeRegistry.getAll().values.toTypedArray()).apply {
                        selectedItem = instance.get<Theme>(name)

                        addActionListener {
                            instance.set(name, selectedItem)

                            SwingUtilities.invokeLater {
                                instance.get<Theme>(name).changeTo()
                                this@SwingSettingsPlugin.updateComponents()
                            }

                            SettingsGUI.serializeConfig(plugin)
                        }
                    }
                }

            }

            ConfigUtil.getSettings<SwingSettings>("deflatedpickle@swing_settings#>=1.0.0")?.let {
                SwingUtilities.invokeLater {
                    it.theme.changeTo()
                    this.updateComponents()
                }
            }
        }
    }

    private fun updateComponents() {
        for (w in Window.getWindows()) {
            SwingUtilities.updateComponentTreeUI(w)
        }
    }
}

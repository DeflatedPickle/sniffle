/* Copyright (c) 2020-2021 DeflatedPickle under the MIT license */

@file:Suppress("UNCHECKED_CAST")

package com.deflatedpickle.sniffle.swingsettings

import com.deflatedpickle.haruhi.api.Registry
import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.api.plugin.PluginType
import com.deflatedpickle.haruhi.event.EventDeserializedConfig
import com.deflatedpickle.haruhi.event.EventProgramFinishSetup
import com.deflatedpickle.haruhi.event.EventSerializeConfig
import com.deflatedpickle.haruhi.util.ConfigUtil
import com.deflatedpickle.haruhi.util.RegistryUtil
import com.deflatedpickle.marvin.extensions.get
import com.deflatedpickle.marvin.extensions.set
import com.deflatedpickle.sniffle.swingsettings.api.Font
import com.deflatedpickle.sniffle.swingsettings.api.FontFamily
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
import com.deflatedpickle.sniffle.swingsettings.theme.KunststoffTheme
import com.deflatedpickle.sniffle.swingsettings.theme.NimRODTheme
import com.deflatedpickle.sniffle.swingsettings.theme.Plastic3DTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticBrownSugarTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticDarkStarTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticDesertBlueTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticDesertBluerTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticDesertGreenTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticDesertRedTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticDesertYellowTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticExperienceBlueTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticExperienceGreenTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticSilverTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticSkyBlueTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticSkyBluerTahomaTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticSkyBluerTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticSkyGreenTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticSkyKruppTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticSkyPinkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticSkyRedTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticSkyYellowTheme
import com.deflatedpickle.sniffle.swingsettings.theme.PlasticXPTheme
import com.deflatedpickle.sniffle.swingsettings.theme.SeaGlassTheme
import com.deflatedpickle.sniffle.swingsettings.theme.SolarizedTheme
import com.deflatedpickle.sniffle.swingsettings.theme.SwingMetalTheme
import com.deflatedpickle.sniffle.swingsettings.theme.SwingMotifTheme
import com.deflatedpickle.sniffle.swingsettings.theme.SwingNativeTheme
import com.deflatedpickle.sniffle.swingsettings.theme.SwingNimbusTheme
import com.deflatedpickle.sniffle.swingsettings.theme.TinyLafRadianceTheme
import com.deflatedpickle.sniffle.swingsettings.theme.TinyLafYQTheme
import com.deflatedpickle.sniffle.swingsettings.theme.TinyMediaManagerDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.TinyMediaManagerLightTheme
import java.awt.Component
import java.awt.GraphicsEnvironment
import java.awt.Window
import javax.swing.JComboBox
import javax.swing.SwingUtilities

@Plugin(
    value = "swing_settings",
    author = "DeflatedPickle",
    version = "1.1.0",
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
            listOf(
                // Swing
                SwingMetalTheme,
                SwingNimbusTheme,
                SwingMotifTheme,
                SwingNativeTheme,
                // Darcula
                DarculaTheme,
                // FlatLaf
                FlatLafLightTheme,
                FlatLafDarkTheme,
                FlatLafIntelliJTheme,
                FlatLafDarculaTheme,
                // FlatLaf - IntelliJ
                FlatLafArcTheme,
                FlatLafArcOrangeTheme,
                FlatLafArcDarkTheme,
                FlatLafArcDarkOrangeTheme,
                FlatLafCarbonTheme,
                FlatLafCobalt2Theme,
                FlatLafCyanLightTheme,
                FlatLafDarkFlatTheme,
                FlatLafDarkPurpleTheme,
                FlatLafDraculaTheme,
                FlatLafGradiantoDarkFuchsiaTheme,
                FlatLafGradiantoDeepOceanTheme,
                FlatLafGradiantoMidnightBlueTheme,
                FlatLafGradiantoNatureGreenTheme,
                FlatLafGrayTheme,
                FlatLafGruvboxDarkHardTheme,
                FlatLafGruvboxDarkMediumTheme,
                FlatLafGruvboxDarkSoftTheme,
                FlatLafHiberbeeDarkTheme,
                FlatLafHighContrastTheme,
                FlatLafLightFlatTheme,
                FlatLafMaterialDesignDarkTheme,
                FlatLafMonocaiTheme,
                FlatLafNordTheme,
                FlatLafOneDarkTheme,
                FlatLafSolarizedDarkTheme,
                FlatLafSolarizedLightTheme,
                FlatLafSpaceGrayTheme,
                FlatLafVuesionTheme,
                // FlatLaf - Material
                FlatLafMaterialArcDarkTheme,
                FlatLafMaterialArcDarkContrastTheme,
                FlatLafMaterialOneDarkTheme,
                FlatLafMaterialOneDarkContrastTheme,
                FlatLafMaterialOneLightTheme,
                FlatLafMaterialOneLightContrastTheme,
                FlatLafMaterialDraculaTheme,
                FlatLafMaterialDraculaContrastTheme,
                FlatLafMaterialGitHubTheme,
                FlatLafMaterialGitHubContrastTheme,
                FlatLafMaterialLightOwlTheme,
                FlatLafMaterialLightOwlContrastTheme,
                FlatLafMaterialDarkerTheme,
                FlatLafMaterialDarkerContrastTheme,
                FlatLafMaterialDeepOceanTheme,
                FlatLafMaterialDeepOceanContrastTheme,
                FlatLafMaterialLighterTheme,
                FlatLafMaterialLighterContrastTheme,
                FlatLafMaterialOceanicTheme,
                FlatLafMaterialOceanicContrastTheme,
                FlatLafMaterialPalenightTheme,
                FlatLafMaterialPalenightContrastTheme,
                FlatLafMaterialMonokaiProTheme,
                FlatLafMaterialMonokaiProContrastTheme,
                FlatLafMaterialMoonlightTheme,
                FlatLafMaterialMoonlightContrastTheme,
                FlatLafMaterialNightOwlTheme,
                FlatLafMaterialNightOwlContrastTheme,
                FlatLafMaterialSolarizedDarkTheme,
                FlatLafMaterialSolarizedDarkContrastTheme,
                FlatLafMaterialSolarizedLightTheme,
                FlatLafMaterialSolarizedLightContrastTheme,
                // DarkLaf
                DarkLafDarculaTheme,
                DarkLafHighContrastDarkTheme,
                DarkLafHighContrastLightTheme,
                DarkLafIntelliJTheme,
                DarkLafOneDarkTheme,
                DarkLafSolarizedDarkTheme,
                DarkLafSolarizedLightTheme,
                // Solarized
                SolarizedTheme,
                // Plastic
                PlasticBrownSugarTheme,
                PlasticDarkStarTheme,
                PlasticDesertBlueTheme,
                PlasticDesertBluerTheme,
                PlasticDesertGreenTheme,
                PlasticDesertRedTheme,
                PlasticDesertYellowTheme,
                PlasticExperienceBlueTheme,
                PlasticExperienceGreenTheme,
                PlasticSilverTheme,
                PlasticSkyBlueTheme,
                PlasticSkyBluerTheme,
                PlasticSkyBluerTahomaTheme,
                PlasticSkyGreenTheme,
                PlasticSkyKruppTheme,
                PlasticSkyPinkTheme,
                PlasticSkyRedTheme,
                PlasticSkyYellowTheme,
                Plastic3DTheme,
                PlasticXPTheme,
                // Kunststoff
                KunststoffTheme,
                // NimROD
                NimRODTheme,
                // TinyMediaManager
                TinyMediaManagerLightTheme,
                TinyMediaManagerDarkTheme,
                // TinyLaf
                TinyLafYQTheme,
                TinyLafRadianceTheme,
                // SeaGlass
                SeaGlassTheme,
            ).forEach {
                register(it.id, it)
            }
        }

        EventDeserializedConfig.addListener { file ->
            if ("swing_settings" in file.name) {
                ConfigUtil.getSettings<SwingSettings>("deflatedpickle@swing_settings#>=1.0.0")?.let { settings ->
                    SwingUtilities.invokeLater {
                        settings.theme.apply {
                            this.apply()

                            settings.font.also {
                                setFont(
                                    if (it.name.name == "") {
                                        Font(
                                            style = it.style,
                                            size = it.size
                                        )
                                    } else {
                                        Font(
                                            it.name,
                                            it.style,
                                            it.size
                                        )
                                    }
                                )
                            }
                        }
                    }
                }
            }
        }

        EventProgramFinishSetup.addListener {
            this.updateComponents()

            (RegistryUtil.get("setting_type") as Registry<String, (Plugin, String, Any) -> Component>?)?.let { registry ->
                registry.register(Theme::class.qualifiedName!!) { plugin, name, instance ->
                    // Theme::class.sealedSubclasses.map { it.objectInstance as Theme }.toTypedArray()
                    JComboBox(themeRegistry.getAll().values.toTypedArray()).apply {
                        selectedItem = instance.get<Theme>(name)

                        addActionListener {
                            instance.set(name, selectedItem)

                            SwingUtilities.invokeLater {
                                instance.get<Theme>(name).apply {
                                    this.apply()
                                    // TODO: Reset the font to the new theme's default
                                }
                                this@SwingSettingsPlugin.updateComponents()
                            }

                            ConfigUtil.serializeConfig(plugin)
                        }
                    }
                }

                registry.register(FontFamily::class.qualifiedName!!) { plugin, name, instance ->
                    // Theme::class.sealedSubclasses.map { it.objectInstance as Theme }.toTypedArray()
                    JComboBox(GraphicsEnvironment.getLocalGraphicsEnvironment().availableFontFamilyNames).apply {
                        selectedItem = instance.get<FontFamily>(name).name

                        addActionListener {
                            instance.set(name, FontFamily(selectedItem as String))
                            ConfigUtil.serializeConfig(plugin)
                        }
                    }
                }
            }

            ConfigUtil.getSettings<SwingSettings>("deflatedpickle@swing_settings#>=1.0.0")?.let { settings ->
                EventSerializeConfig.addListener {
                    if ("swing_settings" in it.name) {
                        SwingUtilities.invokeLater {
                            settings.font.also { font ->
                                settings.theme.setFont(
                                    Font(
                                        font.name,
                                        font.style,
                                        font.size
                                    )
                                )
                            }

                            this.updateComponents()
                        }
                    }
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

/* Copyright (c) 2020-2021 DeflatedPickle under the MIT license */

@file:Suppress("UNCHECKED_CAST")

package com.deflatedpickle.sniffle.swingsettings

import com.deflatedpickle.haruhi.api.Registry
import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.api.plugin.PluginType
import com.deflatedpickle.haruhi.event.EventProgramFinishSetup
import com.deflatedpickle.haruhi.event.EventSerializeConfig
import com.deflatedpickle.haruhi.util.ConfigUtil
import com.deflatedpickle.haruhi.util.RegistryUtil
import com.deflatedpickle.marvin.extensions.get
import com.deflatedpickle.marvin.extensions.set
import com.deflatedpickle.rawky.settings.SettingsGUI
import com.deflatedpickle.sniffle.swingsettings.api.Font
import com.deflatedpickle.sniffle.swingsettings.api.FontFamily
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.config.SwingSettings
import com.deflatedpickle.sniffle.swingsettings.theme.*
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
                                instance.get<Theme>(name).apply {
                                    changeTo()
                                    // TODO: Reset the font to the new theme's default
                                }
                                this@SwingSettingsPlugin.updateComponents()
                            }

                            SettingsGUI.serializeConfig(plugin)
                        }
                    }
                }

                registry.register(FontFamily::class.qualifiedName!!) { plugin, name, instance ->
                    // Theme::class.sealedSubclasses.map { it.objectInstance as Theme }.toTypedArray()
                    JComboBox(GraphicsEnvironment.getLocalGraphicsEnvironment().availableFontFamilyNames).apply {
                        selectedItem = instance.get<FontFamily>(name).name

                        addActionListener {
                            instance.set(name, FontFamily(selectedItem as String))
                            SettingsGUI.serializeConfig(plugin)
                        }
                    }
                }
            }

            ConfigUtil.getSettings<SwingSettings>("deflatedpickle@swing_settings#>=1.0.0")?.let { settings ->
                SwingUtilities.invokeLater {
                    settings.theme.apply {
                        changeTo()

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

                    this.updateComponents()
                }

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

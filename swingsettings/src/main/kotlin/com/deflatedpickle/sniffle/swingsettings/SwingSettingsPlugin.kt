/* Copyright (c) 2020-2021 DeflatedPickle under the MIT license */

@file:Suppress("UNCHECKED_CAST")

package com.deflatedpickle.sniffle.swingsettings

import com.deflatedpickle.haruhi.Haruhi
import com.deflatedpickle.haruhi.api.Registry
import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.api.plugin.PluginType
import com.deflatedpickle.haruhi.event.EventDeserializedConfig
import com.deflatedpickle.haruhi.event.EventProgramFinishSetup
import com.deflatedpickle.haruhi.event.EventSerializeConfig
import com.deflatedpickle.haruhi.util.ConfigUtil
import com.deflatedpickle.haruhi.util.RegistryUtil
import com.deflatedpickle.marvin.functions.extensions.get
import com.deflatedpickle.marvin.functions.extensions.set
import com.deflatedpickle.sniffle.swingsettings.api.Font
import com.deflatedpickle.sniffle.swingsettings.api.FontFamily
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import com.deflatedpickle.sniffle.swingsettings.config.SwingSettings
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafArcDarkOrangeTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafArcDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafArcOrangeTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafArcTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafCarbonTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafCatppuccinFrappeIntelliJTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafCatppuccinLatteIntelliJTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafCatppuccinMacchiatoIntelliJTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafCatppuccinMochaIntelliJTheme
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
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialArcDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialDarkerTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialDeepOceanTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialDesignDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialDraculaTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialGitHubTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialLightOwlTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialLighterTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialMonokaiProTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialMoonlightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialNightOwlTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialOceanicTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialOneDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialOneLightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialPalenightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialSolarizedDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMaterialSolarizedLightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMonocaiTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafMonokaiProTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafNordTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafOneDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafSolarizedDarkTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafSolarizedLightTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafSpaceGrayTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafVuesionTheme
import com.deflatedpickle.sniffle.swingsettings.theme.FlatLafXCodeTheme
import com.formdev.flatlaf.FlatLaf
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
    dependencies = ["deflatedpickle@settings_gui#>=1.0.0"],
    settings = SwingSettings::class,
)
@Suppress("unused")
object SwingSettingsPlugin {
    init {
        val themeRegistry = Registry<String, Theme>()
        RegistryUtil.register("theme", themeRegistry)

        themeRegistry.apply {
            listOf(
                // FlatLaf
                FlatLafLightTheme,
                FlatLafDarkTheme,
                FlatLafIntelliJTheme,
                FlatLafDarculaTheme,
                // IntelliJ
                FlatLafArcDarkTheme,
                FlatLafArcDarkOrangeTheme,
                FlatLafArcTheme,
                FlatLafArcOrangeTheme,
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
                FlatLafMonokaiProTheme,
                FlatLafNordTheme,
                FlatLafOneDarkTheme,
                FlatLafSolarizedDarkTheme,
                FlatLafSolarizedLightTheme,
                FlatLafSpaceGrayTheme,
                FlatLafVuesionTheme,
                FlatLafXCodeTheme,
                // Material
                FlatLafMaterialArcDarkTheme,
                FlatLafMaterialOneDarkTheme,
                FlatLafMaterialOneLightTheme,
                FlatLafMaterialDraculaTheme,
                FlatLafMaterialGitHubTheme,
                FlatLafMaterialLightOwlTheme,
                FlatLafMaterialDarkerTheme,
                FlatLafMaterialDeepOceanTheme,
                FlatLafMaterialLighterTheme,
                FlatLafMaterialOceanicTheme,
                FlatLafMaterialPalenightTheme,
                FlatLafMaterialMonokaiProTheme,
                FlatLafMaterialMoonlightTheme,
                FlatLafMaterialNightOwlTheme,
                FlatLafMaterialSolarizedDarkTheme,
                FlatLafMaterialSolarizedLightTheme,
                // Catppuccin
                FlatLafCatppuccinFrappeIntelliJTheme,
                FlatLafCatppuccinLatteIntelliJTheme,
                FlatLafCatppuccinMacchiatoIntelliJTheme,
                FlatLafCatppuccinMochaIntelliJTheme,
            )
                .forEach { register(it.id, it) }
        }

        EventDeserializedConfig.addListener { file ->
            if ("swing_settings" in file.name) {
                ConfigUtil.getSettings<SwingSettings>("deflatedpickle@swing_settings#>=1.0.0")?.let {
                        settings ->
                    settings.theme.apply {
                        this.apply()

                        settings.font.also {
                            if (it.family.name == "") {
                                setFont(Font(style = it.style, size = it.size))
                            } else {
                                FlatLaf.setPreferredFontFamily(it.family.name)
                            }
                        }
                    }
                }
            }
        }

        EventProgramFinishSetup.addListener {
            this.updateComponents()

            (RegistryUtil.get("setting_type") as Registry<String, (Plugin, String, Any) -> Component>?)
                ?.let { registry ->
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
                        JComboBox(GraphicsEnvironment.getLocalGraphicsEnvironment().availableFontFamilyNames)
                            .apply {
                                selectedItem = instance.get<FontFamily>(name).name

                                addActionListener {
                                    instance.set(name, FontFamily(selectedItem as String))
                                    ConfigUtil.serializeConfig(plugin)
                                }
                            }
                    }
                }

            ConfigUtil.getSettings<SwingSettings>("deflatedpickle@swing_settings#>=1.0.0")?.let { settings,
                ->
                EventSerializeConfig.addListener {
                    if ("swing_settings" in it.name) {
                        SwingUtilities.invokeLater {
                            settings.font.also { font ->
                                settings.theme.setFont(Font(font.family, font.style, font.size))
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

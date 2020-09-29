package com.deflatedpickle.rawky.settings

import com.deflatedpickle.haruhi.api.Registry
import com.deflatedpickle.haruhi.api.constants.MenuCategory
import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.event.EventProgramFinishSetup
import com.deflatedpickle.haruhi.util.ConfigUtil
import com.deflatedpickle.haruhi.util.PluginUtil
import com.deflatedpickle.haruhi.util.RegistryUtil
import com.deflatedpickle.rawky.settings.extension.get
import com.deflatedpickle.rawky.settings.extension.set
import kotlinx.serialization.ImplicitReflectionSerializer
import org.jdesktop.swingx.JXTextField
import java.awt.Component
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent
import java.io.File
import java.util.regex.PatternSyntaxException
import javax.swing.JCheckBox
import javax.swing.JMenu
import javax.swing.tree.DefaultMutableTreeNode

@Suppress("unused")
@ImplicitReflectionSerializer
@Plugin(
    value = "settings_gui",
    author = "DeflatedPickle",
    version = "1.0.0",
    dependencies = [
        "deflatedpickle@discord_rpc#1.0.0"
    ]
)
object SettingsGUI {
    init {
        @Suppress("UNCHECKED_CAST")
        RegistryUtil.register("setting_type", Registry<String, (Plugin, String, Any) -> Component>() as Registry<String, Any>)

        EventProgramFinishSetup.addListener {
            val menuBar = RegistryUtil.get(MenuCategory.MENU.name)
            val toolMenu = menuBar?.get(MenuCategory.FILE.name) as JMenu
            toolMenu.add("Settings").apply {
                addActionListener {
                    SettingsDialog.isVisible = true
                }
            }

            val registry = RegistryUtil.get("setting_type") as Registry<String, (Plugin, String, Any) -> Component>
            registerBoolean(registry)
            registerString(registry)
        }

        EventProgramFinishSetup.addListener {
            for (plugin in PluginUtil.discoveredPlugins) {
                if (plugin.settings != Nothing::class) {
                    SettingsDialog.searchPanel.model.insertNodeInto(
                        DefaultMutableTreeNode(PluginUtil.pluginToSlug(plugin)),
                        Categories.nodePlugin,
                        SettingsDialog.searchPanel.model.getChildCount(Categories.nodePlugin)
                    )
                }
            }
        }

        SettingsDialog.searchPanel.searchField.addActionListener {
            try {
                SettingsDialog.searchPanel.tree.searchable.search(it.actionCommand)
            } catch (e: PatternSyntaxException) {
            }
        }
    }

    private fun registerBoolean(registry: Registry<String, (Plugin, String, Any) -> Component>) {
        registry.register(Boolean::class.qualifiedName!!) { plugin, name, instance ->
            JCheckBox().apply {
                isSelected = instance.get(name)

                addActionListener {
                    isSelected = !instance.get<Boolean>(name)
                    instance.set(name, isSelected)

                    val id = PluginUtil.pluginToSlug(plugin)
                    ConfigUtil.serializeConfig(
                        id, File("config/$id.json")
                    )
                }
            }
        }
    }

    private fun registerString(registry: Registry<String, (Plugin, String, Any) -> Component>) {
        registry.register(String::class.qualifiedName!!) { plugin, name, instance ->
            JXTextField(name).apply {
                text = instance.get(name)

                addKeyListener(object : KeyAdapter() {
                    override fun keyTyped(e: KeyEvent) {
                        instance.set(name, text + e.keyChar)

                        val id = PluginUtil.pluginToSlug(plugin)
                        ConfigUtil.serializeConfig(
                            id, File("config/$id.json")
                        )
                    }
                })
            }
        }
    }
}

/* Copyright (c) 2020-2021 DeflatedPickle under the MIT license */

@file:Suppress("UNCHECKED_CAST")

package com.deflatedpickle.rawky.settings

import com.deflatedpickle.haruhi.api.Registry
import com.deflatedpickle.haruhi.api.constants.MenuCategory
import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.event.EventProgramFinishSetup
import com.deflatedpickle.haruhi.util.ConfigUtil
import com.deflatedpickle.haruhi.util.PluginUtil
import com.deflatedpickle.haruhi.util.RegistryUtil
import com.deflatedpickle.marvin.extensions.get
import com.deflatedpickle.marvin.extensions.set
import com.deflatedpickle.undulation.DocumentAdapter
import com.deflatedpickle.undulation.extensions.findNode
import com.deflatedpickle.undulation.extensions.getText
import com.deflatedpickle.undulation.widget.SliderSpinner
import kotlinx.serialization.InternalSerializationApi
import org.jdesktop.swingx.JXTextField
import java.awt.Component
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent
import java.io.File
import java.util.regex.PatternSyntaxException
import javax.swing.JCheckBox
import javax.swing.JComboBox
import javax.swing.JMenu
import javax.swing.tree.DefaultMutableTreeNode

@Suppress("unused")
@Plugin(
    value = "settings_gui",
    author = "DeflatedPickle",
    version = "1.1.1"
)
object SettingsGUI {
    init {
        @Suppress("UNCHECKED_CAST")
        RegistryUtil.register(
            "setting_type",
            Registry<String, (Plugin, String, Any) -> Component>() as Registry<String, Any>
        )

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
            registerEnum(registry)
            registerInt(registry)
        }

        EventProgramFinishSetup.addListener {
            for (plugin in PluginUtil.discoveredPlugins) {
                if (plugin.settings != Nothing::class) {
                    var authorNode = Categories.nodePlugin.findNode(plugin.author)

                    if (authorNode == null) {
                        authorNode = DefaultMutableTreeNode(plugin.author)

                        SettingsDialog.searchPanel.model.insertNodeInto(
                            authorNode,
                            Categories.nodePlugin,
                            SettingsDialog.searchPanel.model.getChildCount(Categories.nodePlugin)
                        )
                    }

                    SettingsDialog.searchPanel.model.insertNodeInto(
                        DefaultMutableTreeNode(plugin),
                        authorNode,
                        authorNode.leafCount - 1
                    )
                }
            }

            SettingsDialog.searchPanel.tree.expandAll()
        }

        SettingsDialog.searchPanel.searchField.apply {
            document.addDocumentListener(
                DocumentAdapter {
                    try {
                        SettingsDialog.searchPanel.tree.searchable.search(it.document.getText())
                    } catch (e: PatternSyntaxException) {
                    }
                }
            )
        }
    }

    @OptIn(InternalSerializationApi::class)
    fun serializeConfig(plugin: Plugin) {
        val id = PluginUtil.pluginToSlug(plugin)
        ConfigUtil.serializeConfig(
            id, File("config/$id.json")
        )
    }

    private fun registerBoolean(registry: Registry<String, (Plugin, String, Any) -> Component>) {
        registry.register(Boolean::class.qualifiedName!!) { plugin, name, instance ->
            JCheckBox().apply {
                isSelected = instance.get(name)

                addActionListener {
                    isSelected = !instance.get<Boolean>(name)
                    instance.set(name, isSelected)
                    serializeConfig(plugin)
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
                        serializeConfig(plugin)
                    }
                })
            }
        }
    }

    private fun registerEnum(registry: Registry<String, (Plugin, String, Any) -> Component>) {
        registry.register(Enum::class.qualifiedName!!) { plugin, name, instance ->
            val clazz = instance.get<Enum<*>>(name)::class.java

            JComboBox(clazz.enumConstants).apply {
                selectedIndex = instance.get<Enum<*>>(name).ordinal

                addActionListener {
                    instance.set(name, clazz.enumConstants[selectedIndex])
                    serializeConfig(plugin)
                }
            }
        }
    }

    private fun registerInt(registry: Registry<String, (Plugin, String, Any) -> Component>) {
        registry.register(Int::class.qualifiedName!!) { plugin, name, instance ->
            SliderSpinner(
                instance.get(name),
                0,
                100
            ).apply {
                value = instance.get(name)

                addChangeListener {
                    instance.set(name, value)
                    serializeConfig(plugin)
                }
            }
        }
    }
}

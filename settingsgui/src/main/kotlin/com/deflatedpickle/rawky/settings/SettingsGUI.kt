/* Copyright (c) 2020-2021 DeflatedPickle under the MIT license */

@file:Suppress("UNCHECKED_CAST")

package com.deflatedpickle.rawky.settings

import com.deflatedpickle.haruhi.api.Registry
import com.deflatedpickle.haruhi.api.constants.MenuCategory
import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.event.EventProgramFinishSetup
import com.deflatedpickle.haruhi.util.ConfigUtil
import com.deflatedpickle.haruhi.util.ConfigUtil.serializeConfig
import com.deflatedpickle.haruhi.util.PluginUtil
import com.deflatedpickle.haruhi.util.RegistryUtil
import com.deflatedpickle.marvin.extensions.get
import com.deflatedpickle.marvin.extensions.set
import com.deflatedpickle.monocons.MonoIcon
import com.deflatedpickle.rawky.settings.api.FloatRange
import com.deflatedpickle.rawky.settings.api.IntRange
import com.deflatedpickle.undulation.DocumentAdapter
import com.deflatedpickle.undulation.constraints.FillHorizontal
import com.deflatedpickle.undulation.functions.extensions.findNode
import com.deflatedpickle.undulation.functions.extensions.getText
import com.deflatedpickle.undulation.widget.ColourButton
import com.deflatedpickle.undulation.widget.SliderSpinner
import kotlinx.serialization.InternalSerializationApi
import org.jdesktop.swingx.JXButton
import org.jdesktop.swingx.JXTextField
import org.jdesktop.swingx.prompt.BuddySupport.Position.RIGHT
import java.awt.Color
import java.awt.Component
import java.awt.GridBagLayout
import java.awt.Panel
import java.awt.Point
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent
import java.io.File
import java.lang.NullPointerException
import java.util.regex.PatternSyntaxException
import javax.swing.JCheckBox
import javax.swing.JComboBox
import javax.swing.JFileChooser
import javax.swing.JLabel
import javax.swing.JMenu
import javax.swing.JSpinner
import javax.swing.SpinnerNumberModel
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
            // Basic
            registerBoolean(registry)
            registerString(registry)
            registerEnum(registry)
            registerInt(registry)
            registerFloat(registry)

            registerFile(registry)

            // Swing
            registerPoint(registry)
            registerColor(registry)
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
            val ann = try {
                instance::class.java.getDeclaredField(name).getAnnotation(IntRange::class.java)
            } catch (e: NullPointerException) {
                null
            }

            SliderSpinner(
                instance.get(name),
                ann?.min ?: 1,
                ann?.max ?: 10,
            ).apply {
                value = instance.get(name)

                addChangeListener {
                    instance.set(name, value)
                    serializeConfig(plugin)
                }
            }
        }
    }

    private fun registerFloat(registry: Registry<String, (Plugin, String, Any) -> Component>) {
        registry.register(Float::class.qualifiedName!!) { plugin, name, instance ->
            val ann = try {
                instance::class.java.getDeclaredField(name).getAnnotation(FloatRange::class.java)
            } catch (e: NullPointerException) {
                null
            }

            SliderSpinner(
                instance.get(name),
                ann?.min ?: 1f,
                ann?.max ?: 10f,
            ).apply {
                value = instance.get(name)

                addChangeListener {
                    instance.set(name, value)
                    serializeConfig(plugin)
                }
            }
        }
    }

    private fun registerFile(registry: Registry<String, (Plugin, String, Any) -> Component>) {
        registry.register(File::class.qualifiedName!!) { plugin, name, instance ->
            JXTextField(name).apply {
                text = (instance.get(name) as File).absolutePath

                val field = this

                val chooser = JFileChooser(text).apply {
                    fileSelectionMode = JFileChooser.DIRECTORIES_ONLY
                    isAcceptAllFileFilterUsed = false
                }

                addBuddy(JXButton(MonoIcon.FOLDER_OPEN).apply {
                    addActionListener {
                        if (chooser.showOpenDialog(PluginUtil.window) == JFileChooser.APPROVE_OPTION) {
                            field.text = chooser.selectedFile.absolutePath

                            instance.set(name, File(field.text))
                            serializeConfig(plugin)
                        }
                    }
                }, RIGHT)

                addKeyListener(object : KeyAdapter() {
                    override fun keyTyped(e: KeyEvent) {
                        instance.set(name, File(text + e.keyChar))
                        serializeConfig(plugin)
                    }
                })
            }
        }
    }

    private fun registerPoint(registry: Registry<String, (Plugin, String, Any) -> Component>) {
        registry.register(Point::class.qualifiedName!!) { plugin, name, instance ->
            Panel(GridBagLayout()).apply {
                val ann = try {
                    instance::class.java.getDeclaredField(name).getAnnotation(IntRange::class.java)
                } catch (e: NullPointerException) {
                    null
                }

                val inst = instance.get<Point>(name)

                val x = JSpinner(SpinnerNumberModel(
                    inst.x, ann?.min ?: 8, ann?.max ?: 512, 8)
                )
                val y = JSpinner(SpinnerNumberModel(
                    inst.y, ann?.min ?: 8, ann?.max ?: 512, 8)
                )

                for (i in listOf(x, y)) {
                    i.apply {
                        addChangeListener {
                            instance.set(name, inst.setLocation(
                                x.value.toString().toInt(),
                                y.value.toString().toInt(),
                            ))
                            serializeConfig(plugin)
                        }
                    }
                }

                add(x, FillHorizontal)
                add(JLabel("X"))
                add(y, FillHorizontal)
            }
        }
    }

    private fun registerColor(registry: Registry<String, (Plugin, String, Any) -> Component>) {
        registry.register(Color::class.qualifiedName!!) { plugin, name, instance ->
            ColourButton(instance.get(name)).apply {
                addChangeListener {
                    instance.set(name, this.color)
                    serializeConfig(plugin)
                }
            }
        }
    }
}

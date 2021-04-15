/* Copyright (c) 2020-2021 DeflatedPickle under the MIT license */

@file:Suppress("UNCHECKED_CAST")

package com.deflatedpickle.rawky.settings

import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.api.registry.Registry
import com.deflatedpickle.haruhi.util.ConfigUtil
import com.deflatedpickle.haruhi.util.PluginUtil
import com.deflatedpickle.haruhi.util.RegistryUtil
import com.deflatedpickle.rawky.settings.widget.ErrorLabel
import com.deflatedpickle.rawky.settings.widget.SearchList
import com.deflatedpickle.rawky.ui.constraints.FillBothFinishLine
import com.deflatedpickle.rawky.ui.constraints.FillHorizontal
import com.deflatedpickle.rawky.ui.constraints.FillHorizontalFinishLine
import com.deflatedpickle.rawky.ui.constraints.StickEast
import java.awt.Component
import java.awt.Dimension
import javax.swing.BoxLayout
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JScrollPane
import javax.swing.JSeparator
import javax.swing.JSplitPane
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.MutableTreeNode
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.full.declaredMemberProperties
import kotlinx.serialization.ImplicitReflectionSerializer
import org.oxbow.swingbits.dialog.task.TaskDialog

@ImplicitReflectionSerializer
object SettingsDialog : TaskDialog(PluginUtil.window, "Settings") {
    private val paddingPanel = JPanel().apply {
        val dimension = Dimension(1, 1)

        preferredSize = dimension
        minimumSize = dimension
    }

    val searchPanel = SearchList().apply {
        model.apply {
            insertNodeInto(
                Categories.nodePlugin,
                this.root as MutableTreeNode?,
                this.getChildCount(this.root)
            )
        }

        tree.addTreeSelectionListener {
            if (tree.minSelectionRow == -1) return@addTreeSelectionListener

            val path = it.newLeadSelectionPath
            if (path != null) {
                SettingsPanel.removeAll()

                if (path.path.contains(Categories.nodePlugin)) {
                    val component = path.path.last()

                    val obj = (component as DefaultMutableTreeNode).userObject as String

                    if (PluginUtil.slugToPlugin.containsKey(obj)) {
                        val plugin = PluginUtil.slugToPlugin[obj]!!
                        if (plugin.settings != Nothing::class) {
                            val instance = ConfigUtil.getSettings<Any>(PluginUtil.pluginToSlug(plugin))

                            val registry =
                                RegistryUtil.get("setting_type") as Registry<String, (Plugin, String, Any) -> Component>?
                            // println(registry!!.getAll())

                            for (i in plugin.settings.declaredMemberProperties) {
                                SettingsPanel.add(JLabel("${i.name}:"), StickEast)
                                SettingsPanel.add(JSeparator(JSeparator.HORIZONTAL), FillHorizontal)

                                // println((i.returnType.classifier as KClass<*>).supertypes)
                                // println("$i, ${i is Enum<*>}")

                                for (t in mutableListOf<KType>().apply {
                                    add(i.returnType)
                                    addAll((i.returnType.classifier as KClass<*>).supertypes)
                                }) {
                                    val clazz = (t.classifier as KClass<*>).qualifiedName
                                    // println("$i: $t, $clazz")

                                    clazz?.let { e ->
                                        if (registry!!.has(e)) {
                                            val widget = registry.get(clazz)?.let { it(plugin, i.name, instance) }
                                            SettingsPanel.add(widget ?: ErrorLabel(
                                                "$clazz isn't supported yet!"
                                            ), FillHorizontalFinishLine)
                                        }
                                    }
                                }

                                /*SettingsPanel.add(
                                    registry?.get((i.returnType.classifier as KClass<*>).qualifiedName!!)
                                        ?.let { it(plugin, i.name, instance) } ?: ErrorLabel(
                                        "${(i.returnType.classifier as KClass<*>).qualifiedName} isn't supported yet!"
                                    ),
                                    FillHorizontalFinishLine
                                )*/
                            }
                        }
                    }
                }

                SettingsPanel.add(this@SettingsDialog.paddingPanel, FillBothFinishLine)

                SettingsPanel.doLayout()
                SettingsPanel.repaint()
                SettingsPanel.revalidate()
            }
        }
    }

    private val splitPane = JSplitPane(
        JSplitPane.HORIZONTAL_SPLIT,
        searchPanel, JScrollPane(SettingsPanel)
    ).apply {
        isOneTouchExpandable = true
        isContinuousLayout = true
        resizeWeight = 0.3
    }

    init {
        setCommands(StandardCommand.OK)

        this.fixedComponent = JPanel().apply {
            isOpaque = false
            layout = BoxLayout(this, BoxLayout.Y_AXIS)

            preferredSize = Dimension(400, 200)

            add(this@SettingsDialog.splitPane)
        }
    }
}

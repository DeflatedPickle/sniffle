/* Copyright (c) 2020-2021 DeflatedPickle under the MIT license */

@file:Suppress("UNCHECKED_CAST", "DEPRECATION")

package com.deflatedpickle.rawky.settings

import com.deflatedpickle.haruhi.Haruhi
import com.deflatedpickle.haruhi.api.config.ConfigSection
import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.api.registry.Registry
import com.deflatedpickle.haruhi.util.ConfigUtil
import com.deflatedpickle.haruhi.util.PluginUtil
import com.deflatedpickle.haruhi.util.RegistryUtil
import com.deflatedpickle.marvin.functions.extensions.get
import com.deflatedpickle.rawky.settings.widget.ErrorLabel
import com.deflatedpickle.rawky.settings.widget.SearchList
import com.deflatedpickle.undulation.constraints.FillBothFinishLine
import com.deflatedpickle.undulation.constraints.FillHorizontal
import com.deflatedpickle.undulation.constraints.FillHorizontalFinishLine
import com.deflatedpickle.undulation.constraints.StickEast
import com.deflatedpickle.undulation.widget.CollapsiblePanel
import org.oxbow.swingbits.dialog.task.TaskDialog
import java.awt.Component
import java.awt.Dimension
import java.awt.GridBagLayout
import javax.swing.BoxLayout
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JScrollPane
import javax.swing.JSeparator
import javax.swing.JSplitPane
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.MutableTreeNode
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.full.declaredMemberProperties

object SettingsDialog : TaskDialog(Haruhi.window, "Settings") {
    private val paddingPanel =
        JPanel().apply {
            val dimension = Dimension(1, 1)

            preferredSize = dimension
            minimumSize = dimension
        }

    val searchPanel =
        SearchList().apply {
            model.apply {
                insertNodeInto(
                    Categories.nodePlugin,
                    this.root as MutableTreeNode?,
                    this.getChildCount(this.root),
                )
            }

            tree.addTreeSelectionListener {
                if (tree.minSelectionRow == -1) return@addTreeSelectionListener

                val path = it.newLeadSelectionPath
                if (path != null) {
                    SettingsPanel.removeAll()

                    if (path.path.contains(Categories.nodePlugin)) {
                        val component = path.path.last()

                        (component as DefaultMutableTreeNode).userObject.let { plugin ->
                            if (plugin is Plugin && plugin.settings != Nothing::class) {
                                ConfigUtil.getSettings<Any>(PluginUtil.pluginToSlug(plugin))?.let { instance ->
                                    populatePropertyWidgets(
                                        plugin,
                                        instance,
                                        SettingsPanel,
                                        plugin.settings.declaredMemberProperties,
                                    )
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

    private val splitPane =
        JSplitPane(JSplitPane.HORIZONTAL_SPLIT, searchPanel, JScrollPane(SettingsPanel)).apply {
            isOneTouchExpandable = true
            isContinuousLayout = true
            resizeWeight = 0.1
        }

    init {
        setCommands(StandardCommand.OK)

        this.fixedComponent =
            JPanel().apply {
                isOpaque = false
                layout = BoxLayout(this, BoxLayout.Y_AXIS)

                preferredSize = Dimension(600, 400)

                add(this@SettingsDialog.splitPane)
            }
    }

    private fun populatePropertyWidgets(
        plugin: Plugin,
        settings: Any,
        panel: JPanel,
        properties: Collection<KProperty1<*, *>>,
    ) {
        (RegistryUtil.get("setting_type") as Registry<String, (Plugin, String, Any) -> Component>?)
            ?.let { registry ->
                // println(registry!!.getAll())

                loop@ for (prop in properties) {
                    val failedClasses = mutableListOf<String>()

                    // We need to loop all the types as in some cases,
                    // such as enums, we register a setter for the base type
                    for (
                    t in
                    mutableListOf<KType>().apply {
                        add(prop.returnType)
                        addAll((prop.returnType.classifier as KClass<*>).supertypes)
                    }
                    ) {
                        val clazz = (t.classifier as KClass<*>)
                        val clazzName = clazz.qualifiedName!!
                        // println("$prop: $t, $clazz")

                        // println((prop.returnType.classifier as KClass<*>).supertypes)
                        // println("$prop, ${prop is Enum<*>}")

                        when {
                            registry.has(clazzName) -> {
                                registry.get(clazzName)?.let {
                                    val label =
                                        JLabel(
                                            "${
                                                prop.name.capitalize().split(
                                                    Regex("(?=\\p{Lu})"),
                                                ).joinToString(
                                                    " ",
                                                )
                                            }:",
                                        )
                                    val separator = JSeparator(JSeparator.HORIZONTAL)
                                    val widget = it(plugin, prop.name, settings)

                                    when (panel) {
                                        is CollapsiblePanel -> {
                                            panel.collapse.add(label, StickEast)
                                            panel.collapse.add(separator, FillHorizontal)
                                            panel.collapse.add(widget, FillHorizontalFinishLine)
                                        }
                                        else -> {
                                            panel.add(label, StickEast)
                                            panel.add(separator, FillHorizontal)
                                            panel.add(widget, FillHorizontalFinishLine)
                                        }
                                    }
                                }

                                continue@loop
                            }
                            clazz.supertypes.contains(ConfigSection::class.createType()) -> {
                                val collapsePanel =
                                    CollapsiblePanel(prop.name).apply {
                                        layout = GridBagLayout()
                                        collapse.layout = GridBagLayout()

                                        populatePropertyWidgets(
                                            plugin,
                                            settings.get(prop.name),
                                            this.collapse,
                                            clazz.declaredMemberProperties,
                                        )
                                    }

                                when (panel) {
                                    is CollapsiblePanel -> {
                                        panel.collapse.add(collapsePanel)
                                    }
                                    else -> {
                                        panel.add(collapsePanel, FillHorizontalFinishLine)
                                    }
                                }

                                continue@loop
                            }
                            else -> failedClasses.add(clazzName)
                        }
                    }

                    panel.add(
                        ErrorLabel(
                            "Error with ${prop.name}: ${failedClasses.joinToString()} isn't supported",
                        ),
                        FillHorizontalFinishLine,
                    )
                }
            }
    }
}

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
import kotlinx.serialization.ImplicitReflectionSerializer
import org.oxbow.swingbits.dialog.task.TaskDialog
import java.awt.Component
import java.awt.Dimension
import javax.swing.*
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.MutableTreeNode
import kotlin.reflect.KClass
import kotlin.reflect.full.declaredMemberProperties

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
                            for (i in plugin.settings.declaredMemberProperties) {
                                SettingsPanel.add(JLabel("${i.name}:"), StickEast)
                                SettingsPanel.add(JSeparator(JSeparator.HORIZONTAL), FillHorizontal)

                                val instance = ConfigUtil.getSettings<Any>(PluginUtil.pluginToSlug(plugin))

                                val registry = RegistryUtil.get("setting_type") as Registry<String, (Plugin, String, Any) -> Component>?

                                SettingsPanel.add(
                                    registry?.get((i.returnType.classifier as KClass<*>).qualifiedName!!)?.let { it(plugin, i.name, instance) } ?: ErrorLabel(
                                        "${(i.returnType.classifier as KClass<*>).qualifiedName} isn't supported yet!"
                                    ),
                                    FillHorizontalFinishLine
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

    private val splitPane = JSplitPane(
        JSplitPane.HORIZONTAL_SPLIT,
        searchPanel, JScrollPane(SettingsPanel)
    ).apply {
        isOneTouchExpandable = true
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
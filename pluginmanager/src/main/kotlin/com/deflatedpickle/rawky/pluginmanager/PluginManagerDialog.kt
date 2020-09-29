package com.deflatedpickle.rawky.pluginmanager

import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.util.PluginUtil
import com.deflatedpickle.rawky.discordrpc.util.DiscordRP
import net.arikia.dev.drpc.DiscordRichPresence
import org.jdesktop.swingx.JXList
import org.oxbow.swingbits.dialog.task.TaskDialog
import java.awt.Component
import java.awt.Dimension
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import javax.swing.*

object PluginManagerDialog : TaskDialog(PluginUtil.window, "Plugin Manager") {
    private val panel = PluginManagerPanel()

    private val listModel = DefaultListModel<Plugin>()
    private val list = JXList(this.listModel).apply {
        this.cellRenderer = object : DefaultListCellRenderer() {
            override fun getListCellRendererComponent(
                list: JList<*>?,
                value: Any?,
                index: Int,
                isSelected: Boolean,
                cellHasFocus: Boolean
            ): Component =
                super.getListCellRendererComponent(
                    list,
                    (value as Plugin).value,
                    index,
                    isSelected,
                    cellHasFocus
                )
        }

        addListSelectionListener {
            if (this.selectedIndex == -1) return@addListSelectionListener

            val selected = PluginUtil.discoveredPlugins[this.selectedIndex]
            val dependencies = selected.dependencies

            panel.dependencies.dependenciesTableTree.treeTableModel =
                PluginManagerTreeTableModel(
                    dependencies.map {
                        PluginUtil.slugToPlugin[it]!!
                    }.toTypedArray()
                )

            val plugin = PluginUtil.discoveredPlugins[this.selectedIndex]
            this@PluginManagerDialog.panel.header.refresh(plugin)
            this@PluginManagerDialog.panel.dependencies.refresh(plugin)
        }
    }

    private val splitPane = JSplitPane(JSplitPane.HORIZONTAL_SPLIT, list, panel).apply {
        isOneTouchExpandable = true
    }

    init {
        setCommands(StandardCommand.OK, StandardCommand.CANCEL)

        this.fixedComponent = JPanel().apply {
            isOpaque = false
            layout = BoxLayout(this, BoxLayout.Y_AXIS)

            preferredSize = Dimension(400, 200)

            add(this@PluginManagerDialog.splitPane)
        }

        (SwingUtilities.getWindowAncestor(this.fixedComponent) as JDialog).addWindowListener(object : WindowAdapter() {
            override fun windowClosing(e: WindowEvent) {
                DiscordRP.stack.pop()
            }
        })
    }

    override fun setVisible(visible: Boolean) {
        for (plug in PluginUtil.discoveredPlugins) {
            this.listModel.addElement(plug)
        }
        this.list.selectedIndex = 0

        DiscordRP.stack.push(
            DiscordRichPresence
                .Builder("Plugin Manager")
                .setDetails("Managing plugins")
                .setStartTimestamps(System.currentTimeMillis())
                .build()
        )

        super.setVisible(visible)
    }
}
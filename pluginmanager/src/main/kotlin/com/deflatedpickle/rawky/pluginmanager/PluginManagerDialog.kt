/* Copyright (c) 2020-2021 DeflatedPickle under the MIT license */

@file:Suppress("SimpleRedundantLet", "SpellCheckingInspection")

package com.deflatedpickle.rawky.pluginmanager

import com.deflatedpickle.haruhi.Haruhi
import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.util.PluginUtil
import org.jdesktop.swingx.JXList
import org.oxbow.swingbits.dialog.task.TaskDialog
import java.awt.Component
import java.awt.Dimension
import javax.swing.BoxLayout
import javax.swing.DefaultListCellRenderer
import javax.swing.DefaultListModel
import javax.swing.JList
import javax.swing.JPanel
import javax.swing.JScrollPane
import javax.swing.JSplitPane

object PluginManagerDialog : TaskDialog(Haruhi.window, "Plugin Manager") {
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

            val plugin = PluginUtil.discoveredPlugins[this.selectedIndex]
            this@PluginManagerDialog.panel.header.refresh(plugin)
            this@PluginManagerDialog.panel.dependencies.refresh(plugin)
        }
    }

    private val splitPane = JSplitPane(
        JSplitPane.HORIZONTAL_SPLIT,
        JScrollPane(list), JScrollPane(panel)
    ).apply {
        isOneTouchExpandable = true
        isContinuousLayout = true
        resizeWeight = 0.3
    }

    init {
        setCommands(StandardCommand.OK, StandardCommand.CANCEL)

        this.fixedComponent = JPanel().apply {
            isOpaque = false
            layout = BoxLayout(this, BoxLayout.Y_AXIS)

            preferredSize = Dimension(400, 200)

            add(this@PluginManagerDialog.splitPane)
        }
    }

    override fun setVisible(visible: Boolean) {
        for (plug in PluginUtil.discoveredPlugins) {
            this.listModel.addElement(plug)
        }
        this.list.selectedIndex = 0

        super.setVisible(visible)
    }
}

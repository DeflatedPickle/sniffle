/* Copyright (c) 2020 DeflatedPickle under the MIT license */

package com.deflatedpickle.rawky.settings.widget

import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.undulation.constraints.FillBothFinishLine
import com.deflatedpickle.undulation.constraints.FillHorizontalFinishLine
import java.awt.Component
import java.awt.GridBagLayout
import java.io.File
import javax.swing.JScrollPane
import javax.swing.JTree
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.DefaultTreeCellRenderer
import javax.swing.tree.DefaultTreeModel
import org.jdesktop.swingx.JXPanel
import org.jdesktop.swingx.JXSearchField
import org.jdesktop.swingx.JXTree

class SearchList : JXPanel() {
    private val root = DefaultMutableTreeNode("root")
    val model = DefaultTreeModel(this.root)

    val searchField = JXSearchField().apply {
        searchMode = JXSearchField.SearchMode.INSTANT
    }

    val tree = JXTree(this.model).apply {
        this.cellRenderer = object : DefaultTreeCellRenderer() {
            override fun getTreeCellRendererComponent(
                tree: JTree?,
                value: Any?,
                selected: Boolean,
                expanded: Boolean,
                leaf: Boolean,
                row: Int,
                hasFocus: Boolean
            ): Component = super.getTreeCellRendererComponent(
                tree,
                (value as DefaultMutableTreeNode).userObject.let {
                    when (it) {
                        is Plugin -> it.value.split("_").map { it.capitalize() }.joinToString(" ")
                        else -> value
                    }
                },
                selected, expanded, leaf, row, hasFocus
            )
        }
    }

    init {
        this.layout = GridBagLayout()

        this.tree.isRootVisible = false

        this.add(this.searchField, FillHorizontalFinishLine)
        this.add(JScrollPane(this.tree), FillBothFinishLine)
    }
}

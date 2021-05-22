/* Copyright (c) 2020-2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.rawky.pluginmanager

import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.undulation.constraints.FillHorizontalFinishLine
import com.deflatedpickle.undulation.constraints.StickCenterFinishLine
import com.deflatedpickle.undulation.constraints.StickWestFinishLine
import org.jdesktop.swingx.JXLabel
import org.jdesktop.swingx.JXList
import org.jdesktop.swingx.JXPanel
import java.awt.GridBagLayout
import javax.swing.BoxLayout
import javax.swing.DefaultListModel

class PluginManagerPanel : JXPanel() {
    class Header : JXPanel() {
        val nameLabel = JXLabel("name").apply {
            this.font = this.font.deriveFont(26f)
        }
        val versionLabel = JXLabel("version").apply {
            this.font = this.font.deriveFont(10f)
        }

        val authorLabel = JXLabel("author").apply {
            this.font = this.font.deriveFont(14f)
        }

        val typeLabel = JXLabel("type").apply {
            this.font = this.font.deriveFont(10f)
        }

        val descriptionLabel = JXLabel("description")

        init {
            this.layout = GridBagLayout()

            this.add(
                JXPanel().apply {
                    this.layout = GridBagLayout()

                    this.add(nameLabel)
                    this.add(versionLabel)
                },
                StickCenterFinishLine
            )
            this.add(this.authorLabel, StickCenterFinishLine)
            this.add(this.typeLabel, StickWestFinishLine)
            this.add(this.descriptionLabel, FillHorizontalFinishLine)
        }

        fun refresh(plugin: Plugin) {
            this.nameLabel.text = plugin
                .value
                .split("_")
                .joinToString(" ") { it.capitalize() }

            this.versionLabel.text = "v${plugin.version}"
            this.authorLabel.text = "By ${plugin.author}"
            this.typeLabel.text = "Type: ${plugin.type.name}"

            this.descriptionLabel.text =
                "<html>${
                plugin
                    // Split it, get rid of the short description
                    .description.split("<br>").drop(1)[0]
                    // One BR is too small for me, need b i g
                    .replace("<br>", "<br><br>")
                    .trimIndent()
                }</html>"
        }
    }

    val header = Header()

    class Dependencies : JXPanel() {
        val titleLabel = JXLabel("Dependencies").apply {
            this.font = this.font.deriveFont(18f)
        }

        val dependencyModel = DefaultListModel<String>()
        val dependenciesList = JXList(this.dependencyModel)

        init {
            this.layout = GridBagLayout()

            this.add(this.titleLabel, StickWestFinishLine)
            this.add(this.dependenciesList, FillHorizontalFinishLine)
        }

        fun refresh(plugin: Plugin) {
            this.dependencyModel.removeAllElements()
            val dependencies = plugin.dependencies

            for (i in dependencies) {
                dependencyModel.addElement(i)
            }
        }
    }

    val dependencies = Dependencies()

    init {
        this.layout = BoxLayout(this, BoxLayout.Y_AXIS)

        this.add(this.header)
        this.add(this.dependencies)
    }
}

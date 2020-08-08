package com.deflatedpickle.rawky.settings

import com.deflatedpickle.haruhi.api.constants.MenuCategory
import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.event.EventProgramFinishSetup
import com.deflatedpickle.haruhi.util.PluginUtil
import com.deflatedpickle.haruhi.util.RegistryUtil
import kotlinx.serialization.ImplicitReflectionSerializer
import java.util.regex.PatternSyntaxException
import javax.swing.JMenu
import javax.swing.tree.DefaultMutableTreeNode

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
        EventProgramFinishSetup.addListener {
            val menuBar = RegistryUtil.get(MenuCategory.MENU.name)
            val toolMenu = menuBar?.get(MenuCategory.FILE.name) as JMenu
            toolMenu.add("Settings").apply {
                addActionListener {
                    SettingsDialog.isVisible = true
                }
            }
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
}
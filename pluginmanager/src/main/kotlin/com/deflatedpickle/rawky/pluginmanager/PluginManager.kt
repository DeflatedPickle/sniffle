/* Copyright (c) 2020-2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.rawky.pluginmanager

import com.deflatedpickle.haruhi.Haruhi
import com.deflatedpickle.haruhi.api.constants.MenuCategory
import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.api.plugin.PluginType
import com.deflatedpickle.haruhi.event.EventProgramFinishSetup
import com.deflatedpickle.haruhi.util.PluginUtil
import com.deflatedpickle.haruhi.util.RegistryUtil
import com.deflatedpickle.tosuto.ToastItem
import com.deflatedpickle.tosuto.api.ToastLevel
import javax.swing.JMenu

@Plugin(
    value = "plugin_manager",
    author = "DeflatedPickle",
    version = "1.0.2",
    description = """
        <br>
        A GUI for managing plugins
    """,
    type = PluginType.DIALOG,
)
@Suppress("unused")
object PluginManager {
    init {
        EventProgramFinishSetup.addListener {
            val menuBar = RegistryUtil.get(MenuCategory.MENU.name)
            val toolMenu = menuBar?.get(MenuCategory.TOOLS.name) as JMenu
            toolMenu.add("Plugin Manager").apply {
                addActionListener { PluginManagerDialog.isVisible = true }
            }
        }

        EventProgramFinishSetup.addListener {
            if (PluginUtil.unloadedPlugins.isNotEmpty()) {
                Haruhi.toastWindow.add(
                    ToastItem(
                        level = ToastLevel.WARNING,
                        title = "Unloaded Plugins",
                        content = PluginUtil.unloadedPlugins.joinToString { it.value },
                    ),
                )
            }
        }
    }
}

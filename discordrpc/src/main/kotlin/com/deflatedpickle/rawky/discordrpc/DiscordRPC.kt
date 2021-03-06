/* Copyright (c) 2020 DeflatedPickle under the MIT license */

package com.deflatedpickle.rawky.discordrpc

import com.deflatedpickle.haruhi.api.plugin.Plugin
import com.deflatedpickle.haruhi.api.plugin.PluginType
import com.deflatedpickle.haruhi.event.EventProgramFinishSetup
import com.deflatedpickle.haruhi.event.EventProgramShutdown
import com.deflatedpickle.haruhi.event.EventWindowShown
import com.deflatedpickle.haruhi.util.ConfigUtil
import com.deflatedpickle.haruhi.util.PluginUtil
import com.deflatedpickle.rawky.discordrpc.util.DiscordRP
import net.arikia.dev.drpc.DiscordRichPresence

// This plugin only exists to be a dependency
@Plugin(
    value = "discord_rpc",
    author = "DeflatedPickle",
    version = "1.0.0",
    description = """
        <br>
        Adds Discord RCP integration
    """,
    type = PluginType.API,
    settings = DiscordRPCSettings::class
)
@Suppress("unused")
object DiscordRPC {
    init {
        EventProgramFinishSetup.addListener {
            val settings = ConfigUtil.getSettings<DiscordRPCSettings>(
                "deflatedpickle@discord_rpc#1.0.0"
            )
            val enabled = settings.enabled

            if (enabled) {
                // Connect to Discord RCP
                this.start()
            }

            if (enabled) {
                EventWindowShown.addListener {
                    if (it == PluginUtil.window) {
                        DiscordRP.stack.push(
                            DiscordRichPresence
                                .Builder("")
                                .setDetails("Hanging around, doing nothing")
                                .setStartTimestamps(System.currentTimeMillis())
                                .build()
                        )
                    }
                }
            }
        }

        EventProgramShutdown.addListener {
            // Shutdown Discord RCP
            this@DiscordRPC.stop()
        }
    }

    private fun start() {
        DiscordRP.initializeRCP()
        DiscordRP.timer.start()
    }

    private fun stop() {
        DiscordRP.shutdownRCP()
        DiscordRP.timer.stop()
    }
}

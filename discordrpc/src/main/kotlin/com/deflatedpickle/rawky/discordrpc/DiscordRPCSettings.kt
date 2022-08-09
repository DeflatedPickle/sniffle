/* Copyright (c) 2020 DeflatedPickle under the MIT license */

package com.deflatedpickle.rawky.discordrpc

import com.deflatedpickle.haruhi.api.Config
import kotlinx.serialization.Serializable

@Serializable
data class DiscordRPCSettings(
    override val version: Int = 1,
    var enabled: Boolean = true,
) : Config

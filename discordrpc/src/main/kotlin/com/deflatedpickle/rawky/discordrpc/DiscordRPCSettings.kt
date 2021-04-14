/* Copyright (c) 2020 DeflatedPickle under the MIT license */

package com.deflatedpickle.rawky.discordrpc

import kotlinx.serialization.Serializable

@Serializable
data class DiscordRPCSettings(
    var enabled: Boolean = true
)

/* Copyright (c) 2021 DeflatedPickle under the MIT license */

@file:Suppress("UNCHECKED_CAST")

package com.deflatedpickle.sniffle.swingsettings.util

import com.deflatedpickle.haruhi.api.Registry
import com.deflatedpickle.haruhi.util.RegistryUtil
import com.deflatedpickle.sniffle.swingsettings.api.Theme
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@ExperimentalSerializationApi
object ThemeSerializer : KSerializer<Theme> {
    override val descriptor: SerialDescriptor
        get() = PrimitiveSerialDescriptor(serialName = "Theme", kind = PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: Theme) = encoder.encodeString(value.id)

    override fun deserialize(decoder: Decoder): Theme =
        (RegistryUtil.get("theme") as Registry<String, Theme>).get(decoder.decodeString())!!
}

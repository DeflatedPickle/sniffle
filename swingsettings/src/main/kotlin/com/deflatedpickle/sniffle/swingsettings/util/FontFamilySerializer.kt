/* Copyright (c) 2021 DeflatedPickle under the MIT license */

@file:Suppress("UNCHECKED_CAST")

package com.deflatedpickle.sniffle.swingsettings.util

import com.deflatedpickle.sniffle.swingsettings.api.FontFamily
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@ExperimentalSerializationApi
@Serializer(forClass = FontFamily::class)
object FontFamilySerializer : KSerializer<FontFamily> {
    override val descriptor: SerialDescriptor
        get() = PrimitiveSerialDescriptor(
            serialName = "FontFamily",
            kind = PrimitiveKind.STRING
        )

    override fun serialize(encoder: Encoder, value: FontFamily) =
        encoder.encodeString(value.name)

    override fun deserialize(decoder: Decoder): FontFamily =
        FontFamily(decoder.decodeString())
}

/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.sniffle.swingsettings.api

import com.deflatedpickle.sniffle.swingsettings.util.FontFamilySerializer
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = FontFamilySerializer::class)
class FontFamily(val name: String)

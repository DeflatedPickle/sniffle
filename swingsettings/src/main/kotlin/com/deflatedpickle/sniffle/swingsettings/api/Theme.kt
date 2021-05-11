@file:Suppress("unused", "UNUSED_PARAMETER", "SpellCheckingInspection")

package com.deflatedpickle.sniffle.swingsettings.api

import com.deflatedpickle.sniffle.swingsettings.util.ThemeSerializer
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = ThemeSerializer::class)
abstract class Theme(
    val id: String,
    private val project: Project,
    private val name: String = "",
) {
    enum class Project {
        DARCULA,
        DARKLAF,
        FLATLAF,
        MATERIALUI,
        SWING,
        SUBSTANCE,
    }

    abstract fun changeTo()
    fun setFont(font: Font) {}

    @OptIn(ExperimentalStdlibApi::class)
    override fun toString(): String = "[${project.name.lowercase().capitalize()}] $name"
}
package com.deflatedpickle.rawky.settings.api.range

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class FloatRange(
    val min: Float,
    val max: Float,
)

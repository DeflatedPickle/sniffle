package com.deflatedpickle.rawky.settings.api.range

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class DoubleRange(
    val min: Double,
    val max: Double,
)

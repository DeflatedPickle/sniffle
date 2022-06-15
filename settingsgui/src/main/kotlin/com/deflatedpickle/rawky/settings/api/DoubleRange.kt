package com.deflatedpickle.rawky.settings.api

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class DoubleRange(
    val min: Double,
    val max: Double,
)

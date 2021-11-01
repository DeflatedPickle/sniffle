package com.deflatedpickle.rawky.settings.api

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Range(
    val min: Int,
    val max: Int,
)

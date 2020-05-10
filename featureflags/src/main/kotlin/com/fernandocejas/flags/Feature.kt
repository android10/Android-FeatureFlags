package com.fernandocejas.flags

class Feature(private val flag: Flag, block: Feature.() -> Unit) {
    infix fun whenEnabled(fnFeatureEnabled: () -> Unit) { fnFeatureEnabled.invoke() }
    infix fun whenDisabled(fnFeatureDisabled: () -> Unit) { fnFeatureDisabled.invoke() }
}
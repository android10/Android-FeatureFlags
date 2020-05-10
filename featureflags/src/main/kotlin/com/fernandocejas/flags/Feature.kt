package com.fernandocejas.flags

class Feature(private val flag: Flag, block: Feature.() -> Unit = {}) {

    infix fun whenEnabled(fnFeatureEnabled: () -> Unit) {
        if (flag.enabled) fnFeatureEnabled.invoke()
    }

    infix fun whenDisabled(fnFeatureDisabled: () -> Unit) {
        if (!flag.enabled) fnFeatureDisabled.invoke()
    }
}
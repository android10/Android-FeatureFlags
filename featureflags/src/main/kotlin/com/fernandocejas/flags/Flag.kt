package com.fernandocejas.flags

sealed class Flag(enabled: Boolean) : FeatureFlag(enabled) {
    object Login : Flag(enabled = true)
    object Registration : Flag(enabled = true)
}

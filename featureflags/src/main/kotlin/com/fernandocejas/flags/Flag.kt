package com.fernandocejas.flags

sealed class Flag(val activated: Boolean, val description: String = "") {
    object Login : Flag(true)
    object Registration : Flag(true)
}

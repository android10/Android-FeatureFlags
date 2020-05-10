package com.fernandocejas.flags

sealed class Flag(val enabled: Boolean, val description: String = "") {
    object Login : Flag(true)
    object Registration : Flag(true)
    object NewSearch : Flag(true)
}

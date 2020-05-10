package com.fernandocejas.sample.app

import android.content.Context
import com.fernandocejas.sample.app.extension.message

class Navigator {
    fun startNewSearch(context: Context) { context.message("Starting NEW SEARCH") }
    fun startLegacySearch(context: Context) { context.message("Starting LEGACY SEARCH") }
}

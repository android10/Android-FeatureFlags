package com.fernandocejas.sample.app.extension

import android.content.Context
import android.widget.Toast

fun Context.message(message: String) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
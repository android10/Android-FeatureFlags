package com.fernandocejas.sample.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Locale

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbar()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)

        val buildType = BuildConfig.BUILD_TYPE.toUpperCase(Locale.getDefault())
        val productFlavor = BuildConfig.FLAVOR.toUpperCase(Locale.getDefault())
        val appName = getString(R.string.app_name)
        toolbar.title = "$appName: $buildType - $productFlavor"
    }
}
package com.fernandocejas.sample.app

import android.os.Bundle
import android.view.View.INVISIBLE
import androidx.appcompat.app.AppCompatActivity
import com.fernandocejas.flags.Feature
import com.fernandocejas.flags.Flag
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbar()
        initUI()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)

        val buildType = BuildConfig.BUILD_TYPE.toUpperCase(Locale.getDefault())
        val productFlavor = BuildConfig.FLAVOR.toUpperCase(Locale.getDefault())
        val appName = getString(R.string.app_name)
        toolbar.title = "$appName: $productFlavor - $buildType"
    }

    private fun initUI() {
        Feature(Flag.Login) {
            whenEnabled { featureLogin.visibility = INVISIBLE }
            whenDisabled { println("Feature Login DISABLED") }
        }
    }
}
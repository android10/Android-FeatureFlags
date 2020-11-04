package com.fernandocejas.sample.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fernandocejas.flags.FeatureFlag
import com.fernandocejas.flags.Flag
import com.fernandocejas.sample.app.extension.invisible
import com.fernandocejas.sample.app.extension.visible
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val navigator = Navigator()

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
        //Feature Flags API 1
        Flag.Login whenActivated { featureLogin.visible() } otherwise { featureLogin.invisible() }

        //Feature Flags API 2
//        FeatureFlag(Flag.Registration) whenEnabled { featureRegistration.visible() }

        //Feature Flags API 3
//        btnSearch.setOnClickListener {
//            FeatureFlag(Flag.NewSearch) {
//                whenEnabled { navigator.startNewSearch(applicationContext) }
//                whenDisabled { navigator.startLegacySearch(applicationContext) }
//            }
//        }
    }
}

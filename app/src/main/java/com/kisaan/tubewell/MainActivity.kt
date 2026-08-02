package com.kisaan.tubewell

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.kisaan.tubewell.core.designsystem.theme.KisaanTheme
import com.kisaan.tubewell.core.navigation.AppNavGraph
import com.kisaan.tubewell.feature.login.LoginContent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KisaanTheme {
                //KisaanNavGraph()
//                LoginContent()
                AppNavGraph()
            }
        }
    }
}


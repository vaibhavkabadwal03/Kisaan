package com.kisaan.tubewell

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.kisaan.tubewell.ui.theme.KisaanTheme
import com.kisaan.tubewell.viewmodel.StartupViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val startupViewModel: StartupViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition {

            startupViewModel.isLoading
        }
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KisaanTheme {
                KisaanNavGraph()
            }
        }
    }
}

private fun KisaanNavGraph() {

}

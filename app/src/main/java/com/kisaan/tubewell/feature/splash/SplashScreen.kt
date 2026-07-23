package com.kisaan.tubewell.feature.splash

import androidx.compose.runtime.Composable
import com.kisaan.tubewell.core.designsystem.components.ErrorContent

@Composable
fun SplashScreen(state: SplashUiState) {
    when {
        state.isLoading -> {
            SplashContent()
        }

        state.error != null -> {
            ErrorContent()
            // Later:
            // ErrorView()
        }
    }
}
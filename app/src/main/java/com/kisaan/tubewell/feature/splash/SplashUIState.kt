package com.kisaan.tubewell.feature.splash

data class SplashUiState (val isLoading: Boolean = true,
                          val destination: SplashDestination? = null,
                          val error: String? = null)

enum class SplashDestination{
    LOGIN,
    DASHBOARD,
}
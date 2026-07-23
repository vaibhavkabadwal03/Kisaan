package com.kisaan.tubewell.feature.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(SplashUiState())
    val uiState: StateFlow<SplashUiState> = _uiState.asStateFlow()

    init {
        startup()
    }

    private fun startup() {
        viewModelScope.launch {
            delay(2000)
            _uiState.value = SplashUiState(
                isLoading = false,
                destination = SplashDestination.LOGIN
            )
            // cache check

            // auth check

            // session validation
        }
    }
}
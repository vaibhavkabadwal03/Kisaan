package com.kisaan.tubewell.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

//@HiltViewModel
class StartupViewModel @Inject constructor(
) : ViewModel() {

    var isLoading by mutableStateOf(true)
        private set

    init {

        viewModelScope.launch {
            delay(2000)
            initialize()
            isLoading = false
        }
    }

    private suspend fun initialize() {

        // startup work
        //auth check
        //session validate

    }
}
package com.kisaan.tubewell.feature.signup

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SignupViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(SignupUIState())
    val uiState: StateFlow<SignupUIState> = _uiState.asStateFlow()

    fun onFullNameChange(firstName: String) {
        _uiState.value = _uiState.value.copy(fullName = firstName)
    }

    fun onFatherNameChange(fatherName: String) {
        _uiState.value = _uiState.value.copy(fatherName = fatherName)
    }

    fun onMobileChange(mobile: String) {
        _uiState.value = _uiState.value.copy(mobile = mobile)
    }

    fun onPasswordChange(password: String) {
        _uiState.value = _uiState.value.copy(password = password)
    }

    fun onConfirmPasswordChange(confirmPassword: String) {
        _uiState.value = _uiState.value.copy(confirmPassword = confirmPassword)
    }

    fun onTabSelected(index: Int) {
        _uiState.value = _uiState.value.copy(selectedTabIndex = index)
    }

    fun onSignupClick() {
        // Validation + API call — baad mein
    }
}
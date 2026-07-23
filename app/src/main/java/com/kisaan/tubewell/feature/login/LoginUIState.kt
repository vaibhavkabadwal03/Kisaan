package com.kisaan.tubewell.feature.login

data class LoginUiState(
    val mobile: String = "", //mobile Number
    val password: String = "",
    val isLoading: Boolean = false,
    val error: String? = null
)
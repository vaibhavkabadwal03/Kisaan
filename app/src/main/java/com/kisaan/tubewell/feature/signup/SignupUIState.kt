package com.kisaan.tubewell.feature.signup

data class SignupUIState(
    val fullName: String = "",
    val mobile: String = "",
    val fatherName: String = "",
    val password: String = "",
    val confirmPassword: String = "",
    val isLoading: Boolean = false,
    val error: String? = null,
    val isSuccess: Boolean = false,
    val selectedTabIndex: Int = 1,
)
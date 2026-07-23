package com.kisaan.tubewell.feature.signup

import androidx.compose.runtime.Composable
import com.kisaan.tubewell.core.designsystem.components.ErrorContent

@Composable
fun SignupScreen(
    state: SignupUIState,
    onFullNameChange: (String) -> Unit,
    onFatherNameChange: (String) -> Unit,
    onMobileChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onConfirmPasswordChange: (String) -> Unit,
    onTabSelected: (Int) -> Unit,
    onSignupClick: () -> Unit
) {
    when {
        state.error != null -> {
            ErrorContent()
        }

        else -> SignupContent(
            state,
            onFullNameChange = onFullNameChange,
            onFatherNameChange = onFatherNameChange,
            onMobileChange = onMobileChange,
            onPasswordChange = onPasswordChange,
            onConfirmPasswordChange = onConfirmPasswordChange,
            onTabSelected = onTabSelected,
            onSignupClick = onSignupClick
        )
    }
}
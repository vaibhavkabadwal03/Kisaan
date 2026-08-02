package com.kisaan.tubewell.feature.login

import androidx.compose.runtime.Composable
import com.kisaan.tubewell.core.designsystem.components.ErrorContent

@Composable
fun LoginScreen(
    state: LoginUiState,
    onMobileChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onLoginClick: () -> Unit
) {

    when {
        state.error != null -> {
            ErrorContent()
        }

        state.isLoading -> {
             LoginContent(
                 state = state,
                 onMobileChange = onMobileChange,
                 onPasswordChange = onPasswordChange,
                 onLoginClick = onLoginClick
             )
        }

        else -> LoginContent(
            state = state,
            onMobileChange = onMobileChange,
            onPasswordChange = onPasswordChange,
            onLoginClick = onLoginClick
        )
    }
}
package com.kisaan.tubewell.feature.login

import androidx.compose.runtime.Composable
import com.kisaan.tubewell.core.designsystem.components.ErrorContent

@Composable
fun LoginScreen(
    state: LoginUiState, onUsernameChange: (String) -> Unit,
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
                onUsernameChange = onUsernameChange,
                onPasswordChange = onPasswordChange,
                onLoginClick = onLoginClick
            )
        }
    }
}
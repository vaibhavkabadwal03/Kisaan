package com.kisaan.tubewell.feature.login

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun LoginContent(
    state: LoginUiState,
    onUsernameChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onLoginClick: () -> Unit
){

    Text(text = "Login", color = androidx.compose.ui.graphics.Color.Blue, fontSize = 24.sp)
}

@Preview(showBackground = true)
@Composable
fun LoginContentPreview() {
    LoginContent(
        state = LoginUiState(),
        onUsernameChange = {},
        onPasswordChange = {},
        onLoginClick = {}
    )
    Text(text = "Login", color = androidx.compose.ui.graphics.Color.Blue, fontSize = 24.sp)

}
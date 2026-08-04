package com.kisaan.tubewell.feature.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kisaan.tubewell.R
import com.kisaan.tubewell.core.designsystem.components.AppTextField
import com.kisaan.tubewell.core.designsystem.components.PrimaryButton

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginContent(
    state: LoginUiState = LoginUiState(),
    onMobileChange: (String) -> Unit = {},
    onPasswordChange: (String) -> Unit = {},
    onLoginClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp, 0.dp, 20.dp, 0.dp)
    ) {

        AppTextField(
            label = stringResource(R.string.mobile_number),
            value = state.mobile,
            onValueChange = onMobileChange
        )

        AppTextField(
            label = stringResource(R.string.password),
            value = state.password,
            onValueChange = onPasswordChange
        )

        Spacer(modifier = Modifier.height(20.dp))

        PrimaryButton(
            stringResource(R.string.login),
            onLoginClick,
            modifier = Modifier.fillMaxWidth(),
            enabled = state.mobile.isNotBlank() && state.password.isNotBlank(),
            isLoading = state.isLoading
        )
    }
}
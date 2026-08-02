package com.kisaan.tubewell.feature.login

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController

@Composable
fun LoginRoute(navController: NavHostController, viewModel: LoginViewModel = hiltViewModel()) {

    val state = viewModel.uiState.collectAsStateWithLifecycle()
    LoginScreen(
        state = state.value,
        onMobileChange = viewModel::onMobileChange,
        onPasswordChange = viewModel::onPasswordChange,
        onLoginClick = viewModel::onClick
    )

}
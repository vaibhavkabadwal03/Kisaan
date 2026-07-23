package com.kisaan.tubewell.feature.signup

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.kisaan.tubewell.core.navigation.Routes

@Composable
fun SignupRoute(navController: NavHostController, viewModel: SignupViewModel = hiltViewModel()) {

    val state = viewModel.uiState.collectAsStateWithLifecycle()
    LaunchedEffect(state.value.isSuccess) {
        if (state.value.isSuccess) {
            navController.navigate(Routes.OnBoardingScreen.route) {
                popUpTo(Routes.SignUpScreen.route) {
                    inclusive = true
                }
            }
        }
    }

    SignupScreen(
        state = state.value,
        onFullNameChange = viewModel::onFullNameChange,
        onFatherNameChange = viewModel::onFatherNameChange,
        onMobileChange = viewModel::onMobileChange,
        onPasswordChange = viewModel::onPasswordChange,
        onConfirmPasswordChange = viewModel::onConfirmPasswordChange,
        onTabSelected = viewModel::onTabSelected,
        onSignupClick = viewModel::onSignupClick
    )
}
package com.kisaan.tubewell.feature.splash

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.kisaan.tubewell.core.navigation.AppNavRoutes

@Composable
fun SplashRoute(
    navController: NavHostController,
    viewModel: SplashViewModel = hiltViewModel()
) {

    val state = viewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect(state.value.destination) {

        when (state.value.destination) {
            SplashDestination.LOGIN -> {
                navController.navigate(AppNavRoutes.SignUp) {
                    popUpTo(AppNavRoutes.Splash) {
                        inclusive = true
                    }
                }
            }
            SplashDestination.DASHBOARD -> {}
            null -> Unit
        }
    }

    SplashScreen(
        state = state.value
    )
}
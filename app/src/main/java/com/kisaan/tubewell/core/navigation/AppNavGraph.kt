package com.kisaan.tubewell.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kisaan.tubewell.feature.login.LoginRoute
import com.kisaan.tubewell.feature.signup.SignupRoute
import com.kisaan.tubewell.feature.splash.SplashRoute

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppNavRoutes.Splash
    )
    {
        composable<AppNavRoutes.Splash> {
            SplashRoute(navController)
        }
        composable<AppNavRoutes.Login> {
            LoginRoute(navController)
        }
        composable<AppNavRoutes.SignUp> {
            SignupRoute(navController)
        }
    }
}
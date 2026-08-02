package com.kisaan.tubewell.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kisaan.tubewell.feature.login.LoginRoute
import com.kisaan.tubewell.feature.login.LoginScreen
import com.kisaan.tubewell.feature.signup.SignupRoute
import com.kisaan.tubewell.feature.splash.SplashRoute

@Composable
fun KisaanNavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.SplashScreen.route
    )
    {
        composable(Routes.SplashScreen.route) {
            SplashRoute(navController)
        }
        composable(Routes.LoginScreen.route) {
            LoginRoute(navController)
        }
        composable(Routes.SignUpScreen.route){
            SignupRoute(navController)
        }
    }
}
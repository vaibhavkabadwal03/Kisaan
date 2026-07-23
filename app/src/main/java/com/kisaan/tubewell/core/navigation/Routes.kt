package com.kisaan.tubewell.core.navigation

sealed class Routes(val route: String) {
    object SplashScreen : Routes("splash_screen")
    object LoginScreen : Routes("login_screen")
    object SignUpScreen : Routes("sign_up_screen")
    object OnBoardingScreen : Routes("on_boarding_screen")
    object Review : Routes("review_screen")
    object Dashboard : Routes("dashboard_screen")
}
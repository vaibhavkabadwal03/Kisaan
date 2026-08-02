package com.kisaan.tubewell.core.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class AppNavRoutes {
    @Serializable
    data object Splash : AppNavRoutes()

    @Serializable
    data object Login : AppNavRoutes()

    @Serializable
    data object SignUp : AppNavRoutes()

    @Serializable
    data object OnBoarding : AppNavRoutes()

    @Serializable
    data object Dashboard : AppNavRoutes()

    @Serializable
    data object Review : AppNavRoutes()
}
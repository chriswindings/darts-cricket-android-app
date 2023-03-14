package com.chriswindings.dartsappcricket.navigation

sealed class Screens(val route: String) {
    object HomeScreen : Screens(route = "home_screen")
    object GameScreen : Screens(route = "game_screen")
}

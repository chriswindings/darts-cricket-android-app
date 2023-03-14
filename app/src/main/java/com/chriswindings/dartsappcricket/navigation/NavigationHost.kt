package com.chriswindings.dartsappcricket.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chriswindings.dartsappcricket.screens.GameScreen
import com.chriswindings.dartsappcricket.screens.HomeScreen

@Composable
fun NavigationHost() {
    val navController = rememberNavController();
    NavHost(navController = navController, startDestination = Screens.HomeScreen.route) {
        composable(Screens.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(Screens.GameScreen.route) {
            GameScreen(navController = navController)
        }
    }
}
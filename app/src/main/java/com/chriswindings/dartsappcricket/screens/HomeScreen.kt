package com.chriswindings.dartsappcricket.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.chriswindings.dartsappcricket.navigation.Screens

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 50.dp)
    ) {
        Button(
            onClick = { navController.navigate(Screens.GameScreen.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "New Game")
        }
    }
}
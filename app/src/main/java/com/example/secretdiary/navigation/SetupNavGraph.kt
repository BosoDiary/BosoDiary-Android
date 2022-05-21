package com.example.secretdiary.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.secretdiary.feature.spash.AnimationSplashScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route

    ) {
        composable(route = Screen.Splash.route) {
            AnimationSplashScreen(navController)
        }
    }

}
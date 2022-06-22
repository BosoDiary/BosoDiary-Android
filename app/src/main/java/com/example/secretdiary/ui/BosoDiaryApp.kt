package com.example.secretdiary.ui

import android.app.Application
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.secretdiary.feature.login.LoginScreen
import com.example.secretdiary.feature.spash.AnimationSplashScreen
import com.example.secretdiary.util.Screen

@Composable
fun BosoDiaryApp() {

    // navigation 설정

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route

    ) {
        composable(route = Screen.Splash.route) {
            AnimationSplashScreen(navController)
        }
        composable(route = Screen.Login.route) {
            LoginScreen(navController)
        }
    }

}

class BosoDiaryApplication : Application() {
}
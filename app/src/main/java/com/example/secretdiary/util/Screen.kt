package com.example.secretdiary.util

sealed class Screen(val route : String){
    object Splash : Screen("splash_screen")
    object Login : Screen("login_screen")
}

package com.example.secretdiary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.secretdiary.navigation.SetupNavGraph
import com.example.secretdiary.ui.theme.SecretDiaryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SecretDiaryTheme {
                val navController = rememberNavController()
                SetupNavGraph(navController)
            }
        }
    }
}


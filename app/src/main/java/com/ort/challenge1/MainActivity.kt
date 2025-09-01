package com.ort.challenge1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ort.challenge1.screens.LoginScreen
import com.ort.challenge1.screens.RegisterScreen
import com.ort.challenge1.screens.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "welcome"
                    ) {
                        composable("welcome") { WelcomeScreen(navController) }
                        composable("login") { LoginScreen(navController) }
                        composable("register") { RegisterScreen(navController) }
                    }
                }
            }
        }
    }
}

package com.ort.challenge1.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ort.challenge1.components.CustomOutlinedTextField
import com.ort.challenge1.components.PrimaryButton
import com.ort.challenge1.components.SecondaryTextButton
import com.ort.challenge1.components.SocialImage
import com.ort.challenge1.components.SubtitleText
import com.ort.challenge1.components.TitleText

@Composable
fun LoginScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TitleText("Login here")
        Spacer(Modifier.height(8.dp))
        SubtitleText("Welcome back you’ve been missed!")

        Spacer(Modifier.height(32.dp))
        CustomOutlinedTextField(email, { email = it }, "Email")
        Spacer(Modifier.height(16.dp))
        CustomOutlinedTextField(password, { password = it }, "Password")

        Spacer(Modifier.height(12.dp))
        SecondaryTextButton("Forgot your password?") { /* Acción recuperar contraseña */ }

        Spacer(Modifier.height(16.dp))
        PrimaryButton("Sign in") { /* Acción login */ }

        Spacer(Modifier.height(16.dp))
        SecondaryTextButton("Create new account") { navController.navigate("register") }

        Spacer(Modifier.height(16.dp))
        SocialImage()
    }
}

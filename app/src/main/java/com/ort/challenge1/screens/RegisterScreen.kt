package com.ort.challenge1.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ort.challenge1.components.CustomOutlinedTextField
import com.ort.challenge1.components.PrimaryButton
import com.ort.challenge1.components.SecondaryTextButton
import com.ort.challenge1.components.SocialImage
import com.ort.challenge1.components.SubtitleText
import com.ort.challenge1.components.TitleText

@Composable
fun RegisterScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TitleText("Create Account")
        Spacer(Modifier.height(8.dp))
        SubtitleText(
            "Create an account so you can explore all the existing jobs",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(Modifier.height(32.dp))
        CustomOutlinedTextField(email, { email = it }, "Email")
        Spacer(Modifier.height(16.dp))
        CustomOutlinedTextField(password, { password = it }, "Password")
        Spacer(Modifier.height(16.dp))
        CustomOutlinedTextField(confirmPassword, { confirmPassword = it }, "Confirm Password")

        Spacer(Modifier.height(24.dp))
        PrimaryButton("Sign up") { /* Acción registro */ }

        Spacer(Modifier.height(16.dp))
        SecondaryTextButton("Already have an account") { navController.navigate("login") }

        Spacer(Modifier.height(16.dp))
        SocialImage()
    }
}


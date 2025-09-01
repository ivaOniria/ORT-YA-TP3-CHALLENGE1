package com.ort.challenge1.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ort.challenge1.R

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
        Text(
            text = "Login here",
            style = TextStyle(
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A4DDE)
            )
        )
        Spacer(Modifier.height(8.dp))

        Text(
            text = "Welcome back you’ve been missed!",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
        )

        Spacer(Modifier.height(32.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("Email") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF1A4DDE),
                unfocusedBorderColor = Color(0xFF1A4DDE),
                cursorColor = Color(0xFF1A4DDE)
            )
        )

        Spacer(Modifier.height(16.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text("Password") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF1A4DDE),
                unfocusedBorderColor = Color(0xFF1A4DDE),
                cursorColor = Color(0xFF1A4DDE)
            )
        )

        Spacer(Modifier.height(12.dp))

        TextButton(
            onClick = { /* Recuperar contraseña */ },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(
                "Forgot your password?",
                color = Color(0xFF1A4DDE),
                fontSize = 14.sp
            )
        }

        Spacer(Modifier.height(16.dp))

        Button(
            onClick = { /* Acción login */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A4DDE)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text("Sign in", fontSize = 16.sp, color = Color.White)
        }

        Spacer(Modifier.height(16.dp))

        TextButton(onClick = { navController.navigate("register") }) {
            Text(
                "Create new account",
                fontSize = 14.sp,
                color = Color.Black
            )
        }

        Spacer(Modifier.height(16.dp))

        Image(
            painter = painterResource(id = R.drawable.social),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
    }
}

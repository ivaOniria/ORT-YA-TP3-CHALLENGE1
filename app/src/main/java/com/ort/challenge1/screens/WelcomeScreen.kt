package com.ort.challenge1.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ort.challenge1.R

@Composable
fun WelcomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Image(
            painter = painterResource(id = R.drawable.welcome_screen),
            contentDescription = "Welcome Illustration",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Discover Your\nDream Job here",
            style = TextStyle(
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A4DDE)
            ),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Explore all the existing job roles based on your interest and study major",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 16.dp),
            lineHeight = 20.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                onClick = { navController.navigate("login") },
                modifier = Modifier
                    .weight(1f)
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1A4DDE)
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Login", fontSize = 16.sp, color = Color.White)
            }

            Spacer(modifier = Modifier.width(24.dp))

            TextButton(
                onClick = { navController.navigate("register") },
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    "Register",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
        }
    }
}

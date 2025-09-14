package com.ort.challenge1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ort.challenge1.R

@Composable
fun SocialImage() {
    Image(
        painter = painterResource(id = R.drawable.social),
        contentDescription = null,
        modifier = Modifier.size(200.dp)
    )
}

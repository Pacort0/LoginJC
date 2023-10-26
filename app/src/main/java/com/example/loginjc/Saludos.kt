package com.example.loginjc

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun Saludos(navController: NavHostController) {
    Text (text = "Buenas, usuario")
}
package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A Box container with the image as the background
                Box(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    // Load the background image from the resources
                    Image(
                        painter = painterResource(id = R.drawable.descarga1), // Replace with your image resource
                        contentDescription = null, // Provide a description if needed
                        modifier = Modifier.fillMaxSize()
                    )

                    // Your Composable content here
                    Greeting("ART SPACE")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Representa la imagen de fondo
        Image(
            painter = painterResource(id = R.drawable.descarga1), // Reemplaza con tu recurso de imagen
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        // Representa el primer texto encima de la imagen, centrado en la parte superior
        Text(
            text = "APP $name!",
            fontSize = 24.sp,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(16.dp) // Ajusta el espacio entre el borde y el texto si es necesario
        )

        // Representa el segundo texto debajo de la imagen
        Text(
            text = "Herson Stiven Tangarife Davila - 2010007",
            fontSize = 20.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp) // Ajusta el espacio entre el borde y el texto si es necesario
        )
    }
}


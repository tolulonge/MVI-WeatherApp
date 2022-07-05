package com.tolulonge.mvi_weatherapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.tolulonge.mvi_weatherapp.presentation.ui.theme.MVIWeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVIWeatherAppTheme {
                
            }
        }
    }
}
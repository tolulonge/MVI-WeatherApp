package com.tolulonge.mvi_weatherapp.presentation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.tolulonge.mvi_weatherapp.presentation.ui.theme.Shapes
import com.tolulonge.mvi_weatherapp.presentation.ui.theme.Typography

@Composable
fun MVIWeatherAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
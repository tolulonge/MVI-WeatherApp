package com.tolulonge.mvi_weatherapp.presentation

import com.tolulonge.mvi_weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
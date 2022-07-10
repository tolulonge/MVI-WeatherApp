package com.tolulonge.mvi_weatherapp.domain.weather

import com.tolulonge.mvi_weatherapp.data.remote.WeatherDataDto

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?,
)

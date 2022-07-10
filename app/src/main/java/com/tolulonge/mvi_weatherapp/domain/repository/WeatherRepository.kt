package com.tolulonge.mvi_weatherapp.domain.repository
import com.tolulonge.mvi_weatherapp.domain.util.Resource
import com.tolulonge.mvi_weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}
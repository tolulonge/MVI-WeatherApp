package com.tolulonge.mvi_weatherapp.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.tolulonge.mvi_weatherapp.data.mappers.toWeatherInfo
import com.tolulonge.mvi_weatherapp.data.remote.WeatherApi
import com.tolulonge.mvi_weatherapp.domain.repository.WeatherRepository
import com.tolulonge.mvi_weatherapp.domain.util.Resource
import com.tolulonge.mvi_weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}
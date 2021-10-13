package com.github.kadehar.weatherapp.feature.weather_screen.domain

import com.github.kadehar.weatherapp.feature.weather_screen.data.api.WeatherRepository
import com.github.kadehar.weatherapp.feature.weather_screen.domain.model.WeatherDomainModel

class WeatherInteractor(private val repository: WeatherRepository) {
    suspend fun getWeather(): WeatherDomainModel = repository.getWeather()
}
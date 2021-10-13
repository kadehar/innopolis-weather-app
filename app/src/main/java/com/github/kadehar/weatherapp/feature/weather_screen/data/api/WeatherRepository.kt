package com.github.kadehar.weatherapp.feature.weather_screen.data.api

import com.github.kadehar.weatherapp.feature.weather_screen.domain.model.WeatherDomainModel

interface WeatherRepository {
    suspend fun getWeather() : WeatherDomainModel
}
package com.github.kadehar.weatherapp.feature.weather_screen.domain.model

data class WeatherDomainModel(
    val temperature: String,
    val minTemperature: String,
    val maxTemperature: String,
    val humidity: String
)
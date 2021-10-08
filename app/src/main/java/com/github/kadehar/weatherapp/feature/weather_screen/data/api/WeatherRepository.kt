package com.github.kadehar.weatherapp.feature.weather_screen.data.api

interface WeatherRepository {
    fun getWeather() : String
}
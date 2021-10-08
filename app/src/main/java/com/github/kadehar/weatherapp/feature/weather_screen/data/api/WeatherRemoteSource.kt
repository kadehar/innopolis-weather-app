package com.github.kadehar.weatherapp.feature.weather_screen.data.api

import com.github.kadehar.weatherapp.feature.weather_screen.data.api.model.WeatherModel

class WeatherRemoteSource(val api: WeatherApi) {
    fun getWeather() : WeatherModel {
        return api.getWeather("Moscow")
    }
}
package com.github.kadehar.weatherapp.feature.weather_screen.data.api

import com.github.kadehar.weatherapp.feature.weather_screen.data.toDomain
import com.github.kadehar.weatherapp.feature.weather_screen.domain.model.WeatherDomainModel

class WeatherRepositoryImpl(private val source: WeatherRemoteSource) : WeatherRepository {
    override suspend fun getWeather(): WeatherDomainModel {
        return source.getWeather().toDomain()
    }
}
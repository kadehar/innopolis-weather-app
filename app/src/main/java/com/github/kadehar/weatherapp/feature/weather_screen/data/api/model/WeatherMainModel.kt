package com.github.kadehar.weatherapp.feature.weather_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class WeatherMainModel(
    @SerializedName("temp")
    val temp: String,
    @SerializedName("temp_min")
    val tempMin: String,
    @SerializedName("temp_max")
    val tempMax: String
)

/*
"main": {
    "temp": 282.55,
    "feels_like": 281.86,
    "temp_min": 280.37,
    "temp_max": 284.26,
    "pressure": 1023,
    "humidity": 100
  }
*/

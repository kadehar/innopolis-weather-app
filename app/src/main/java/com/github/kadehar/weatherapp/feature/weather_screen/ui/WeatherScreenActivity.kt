package com.github.kadehar.weatherapp.feature.weather_screen.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.github.kadehar.weatherapp.R
import com.github.kadehar.weatherapp.feature.weather_screen.domain.model.WeatherDomainModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class WeatherScreenActivity : AppCompatActivity() {
    val weatherViewModel by viewModel<WeatherScreenViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_screen)
        weatherViewModel.liveData.observe(this, Observer(::render))
        weatherViewModel.requestWeather()
    }

    private fun render(state: WeatherDomainModel) {
        findViewById<TextView>(R.id.tv_temperature).let {
            it.text = state.temperature
        }
        findViewById<TextView>(R.id.tv_min_temp).let {
            it.text = state.minTemperature
        }
        findViewById<TextView>(R.id.tv_max_temp).let {
            it.text = state.maxTemperature
        }
        findViewById<TextView>(R.id.tv_humidity).let {
            it.text = state.humidity
        }
    }
}
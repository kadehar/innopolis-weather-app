package com.github.kadehar.weatherapp.feature.weather_screen.di

import com.github.kadehar.weatherapp.feature.weather_screen.data.api.WeatherApi
import com.github.kadehar.weatherapp.feature.weather_screen.data.api.WeatherRemoteSource
import com.github.kadehar.weatherapp.feature.weather_screen.data.api.WeatherRepository
import com.github.kadehar.weatherapp.feature.weather_screen.data.api.WeatherRepositoryImpl
import com.github.kadehar.weatherapp.feature.weather_screen.domain.WeatherInteractor
import com.github.kadehar.weatherapp.feature.weather_screen.ui.WeatherScreenViewModel
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://api.openweathermap.org/"
val appModule = module {
    single<OkHttpClient> {
        OkHttpClient.Builder()
            .build()
    }

    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single<WeatherApi> {
        get<Retrofit>().create(WeatherApi::class.java)
    }

    single<WeatherRemoteSource> {
        WeatherRemoteSource(get<WeatherApi>())
    }

    single<WeatherRepository> {
        WeatherRepositoryImpl(get<WeatherRemoteSource>())
    }

    single<WeatherInteractor> {
        WeatherInteractor(get<WeatherRepository>())
    }

    viewModel<WeatherScreenViewModel> {
        WeatherScreenViewModel(get<WeatherInteractor>())
    }
}
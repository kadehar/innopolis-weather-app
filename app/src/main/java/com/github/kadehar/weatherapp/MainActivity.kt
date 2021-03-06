package com.github.kadehar.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.github.kadehar.weatherapp.feature.weather_screen.ui.WeatherScreenActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weatherButton = findViewById<Button>(R.id.weatherButton)
        weatherButton.setOnClickListener {
            Intent(this, WeatherScreenActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}
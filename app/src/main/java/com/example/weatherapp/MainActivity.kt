package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

val CITY : String = "Nairobi, ke"
val API: String = "b31ef167a3ff9a07823ccf76fc32a2d8"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
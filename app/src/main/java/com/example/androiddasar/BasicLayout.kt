package com.example.androiddasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BasicLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_layout)

        supportActionBar?.title = "Google Pixel"

    }
}
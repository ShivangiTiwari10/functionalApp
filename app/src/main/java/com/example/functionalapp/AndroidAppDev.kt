package com.example.functionalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.functionalapp.databinding.ActivityAndroidAppDevBinding

class AndroidAppDev : AppCompatActivity() {

    private lateinit var binding: ActivityAndroidAppDevBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAndroidAppDevBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
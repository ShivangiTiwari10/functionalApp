package com.example.functionalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.functionalapp.databinding.ActivityTechnologiesBinding

class Technologies : AppCompatActivity() {

    private lateinit var binding: ActivityTechnologiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTechnologiesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
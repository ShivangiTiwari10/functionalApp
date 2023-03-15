package com.example.functionalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.functionalapp.databinding.ActivityMachinLernBinding

class MachinLern : AppCompatActivity() {

    private lateinit var binding: ActivityMachinLernBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMachinLernBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
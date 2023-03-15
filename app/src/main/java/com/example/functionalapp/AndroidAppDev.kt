package com.example.functionalapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.functionalapp.databinding.ActivityAndroidAppDevBinding

class AndroidAppDev : AppCompatActivity() {

    private lateinit var binding: ActivityAndroidAppDevBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAndroidAppDevBinding.inflate(layoutInflater)

        binding.kotlin.setOnClickListener {
            val webIntent: Intent = Uri.parse("https://developer.android.com/kotlin").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }
            startActivity(webIntent)
        }
        setContentView(binding.root)
    }
}
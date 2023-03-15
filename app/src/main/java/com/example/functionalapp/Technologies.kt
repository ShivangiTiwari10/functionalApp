package com.example.functionalapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.functionalapp.databinding.ActivityTechnologiesBinding

class Technologies : AppCompatActivity() {

    private lateinit var binding: ActivityTechnologiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTechnologiesBinding.inflate(layoutInflater)

        binding.btnCall.setOnClickListener {
            val callIntent: Intent = Uri.parse("tel:5551234").let { number ->
                Intent(Intent.ACTION_DIAL, number)
            }
            startActivity(callIntent)
        }
        binding.cardView.setOnClickListener {
            val intent = Intent(this, AndroidAppDev::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}
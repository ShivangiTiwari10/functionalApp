package com.example.functionalapp

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import com.example.functionalapp.databinding.ActivityMachinLernBinding

class MachinLern : AppCompatActivity() {

    private lateinit var binding: ActivityMachinLernBinding

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMachinLernBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val vebViewVariable = binding.webView
        webViewSetUp(vebViewVariable)
    }

    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView: WebView) {

        webView.webViewClient = WebViewClient()
        webView.apply {

            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.techtarget.com/searchdatacenter/delltechnologies/Industry-Transformation-Highlights-the-Need-for-APJ-Firms-to-Focus-on-the-Edge?int=off&pre=off&Offer=sy_lp03012023GOOGOTHR_GsidsDataCenter_Dell_Embed_IO177328_LI2647169")
        }

    }
}
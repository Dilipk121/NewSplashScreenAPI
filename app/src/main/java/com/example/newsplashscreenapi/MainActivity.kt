package com.example.newsplashscreenapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //coroutine function
        runBlocking {

        installSplashScreen()
            delay(4000)

        }
        setContentView(R.layout.activity_main)

    }
}
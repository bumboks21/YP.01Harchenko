package com.example.catbreedsapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        val splashScreenDuration:Long=2000
        Handler(Looper.getMainLooper()).postDelayed({
            val inten= Intent(this@MainActivity,InformationGuide::class.java)
            startActivity(inten)
            finish()
        },splashScreenDuration)
    }
}
package com.example.catbreedsapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_test)
    }
    fun onClickStart(view: View)
    {
        val testtStart = Intent(this@StartTest,Test1::class.java)
        startActivity(testtStart)
    }
}
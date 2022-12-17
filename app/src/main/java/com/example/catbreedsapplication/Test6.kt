package com.example.catbreedsapplication

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Test6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test6)
    }
    fun onClick6(view: View)
    {val arguments = intent.extras
        var ball: Int = arguments!!.getInt("balls")
        val answ6 = findViewById<RadioButton>(R.id.radioButton12)
        if(answ6.isChecked==true)
        {
            ball+=1
        }
        val testt6 = Intent(this@Test6,EndTest::class.java)
        testt6.putExtra("balls", ball);
        startActivity(testt6)
    }
}
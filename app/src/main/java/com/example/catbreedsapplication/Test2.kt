package com.example.catbreedsapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class Test2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
    }
    fun onClick2(view: View)
    {
        val arguments = intent.extras
        var ball: Int = arguments!!.getInt("balls")
        val answ2 = findViewById<RadioButton>(R.id.radioButton3)
        if(answ2.isChecked==true)
    {
        ball+=1
    }
        val testt2 = Intent(this@Test2,Test3::class.java)
        testt2.putExtra("balls", ball);
        startActivity(testt2)
    }
}
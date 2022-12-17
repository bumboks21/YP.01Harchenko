package com.example.catbreedsapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class Test1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)
    }

    fun onClick1(view: View)
    {    var ball:Int=0
        val answ1 = findViewById<RadioButton>(R.id.radioButton1)
        if(answ1.isChecked==true)
    {
        ball+=1
    }
        val testt1 = Intent(this@Test1,Test2::class.java)
        testt1.putExtra("balls", ball);
        startActivity(testt1)


    }
}
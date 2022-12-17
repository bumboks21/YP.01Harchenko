package com.example.catbreedsapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class Test5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test5)
    }

    fun onClick5(view: View)
    {val arguments = intent.extras
        var ball: Int = arguments!!.getInt("balls")
        val answ5 = findViewById<RadioButton>(R.id.radioButton10)
        if(answ5.isChecked==true)
        {
            ball+=1
        }
        val testt5 = Intent(this@Test5,Test6::class.java)
        testt5.putExtra("balls", ball);
        startActivity(testt5)
    }
}
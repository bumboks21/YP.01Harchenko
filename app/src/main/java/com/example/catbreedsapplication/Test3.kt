package com.example.catbreedsapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class Test3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test3)
    }


    fun onClick3(view: View)
    { val arguments = intent.extras
        var ball: Int = arguments!!.getInt("balls")
        val answ3 = findViewById<RadioButton>(R.id.radioButton5)
        if(answ3.isChecked==true)
        {
            ball+=1
        }
        val testt3 = Intent(this@Test3,Test4::class.java)
        testt3.putExtra("balls", ball);
        startActivity(testt3)
    }
}
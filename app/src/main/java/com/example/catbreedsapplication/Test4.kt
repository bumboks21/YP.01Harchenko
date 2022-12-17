package com.example.catbreedsapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class Test4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test4)
    }
    fun onClick4(view: View)
    { val arguments = intent.extras
        var ball: Int = arguments!!.getInt("balls")
        val answ4 = findViewById<RadioButton>(R.id.radioButton7)
        if(answ4.isChecked==true)
        {
            ball+=1
        }
        val testt4 = Intent(this@Test4,Test5::class.java)
        testt4.putExtra("balls", ball);
        startActivity(testt4)
    }
}
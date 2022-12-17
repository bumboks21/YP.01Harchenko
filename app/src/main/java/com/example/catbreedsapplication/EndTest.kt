package com.example.catbreedsapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class EndTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_test)
        val arguments = intent.extras
        var ball = arguments!!.getInt("balls")
        var itog=findViewById<TextView>(R.id.textView6)
        if(ball>=5){
            itog.text="Вы очень хорошо разбираетесь в кошках!:)"
        }
        if(ball<5&&ball>=3){
            itog.text="Вы неплохо разбираетесь в кошках!:)"
        }
        if(ball<3){
            itog.text="Вам нужно читать больше информации о кошках!:)"
        }
    }
    fun close(view: View)
    {
        val back = Intent(this@EndTest,InformationGuide::class.java)
        startActivity(back)
   }
}
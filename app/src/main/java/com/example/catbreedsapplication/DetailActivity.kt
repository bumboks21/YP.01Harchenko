package com.example.catbreedsapplication

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DetailActivity : AppCompatActivity() {
    companion object{
        const val SELECTED_ITEM = "SELECTED_ITEM"
    }
    var selectedItem = "Не выбрано"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(resources.configuration.orientation ==
            Configuration.ORIENTATION_LANDSCAPE){
            finish()
            return
        }
        setContentView(R.layout.activity_detail)
        val extras: Bundle? = intent.extras
        selectedItem = extras?.getString(SELECTED_ITEM).toString()
    }

    fun onClick(view: View){
        val intent= Intent(this@DetailActivity,InformationGuide::class.java)
        startActivity(intent)
    }
    override fun onResume() {
        super.onResume()
        val fragment: DetailFragment =
            supportFragmentManager.findFragmentById(R.id.detailFragment) as
                    DetailFragment
        fragment?.setSelectedItem(selectedItem)
    }
}
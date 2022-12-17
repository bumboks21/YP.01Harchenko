package com.example.catbreedsapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class DetailFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    fun setSelectedItem(selectedItem: String?) {
        val infoTextView = view?.findViewById<TextView>(R.id.detail_textView)
        val imageView = view?.findViewById<ImageView>(R.id.imageViewCat)

        when (selectedItem) {
            "Абиссинская кошка" -> {
                infoTextView?.text= getString(R.string.abisinText)
                imageView?.setImageResource(R.drawable.abisin)
            }
            "Австралийский мист"-> {
                infoTextView?.text= getString(R.string.mistText)
                imageView?.setImageResource(R.drawable.mist)
            }
            "Азиатская табби"-> {
                infoTextView?.text= getString(R.string.tabbiText)
                imageView?.setImageResource(R.drawable.tabbi)
            }
            "Американский бобтейл"-> {
                infoTextView?.text= getString(R.string.bobtailText)
                imageView?.setImageResource(R.drawable.bobtail)
            }
            "Американский кёрл"-> {
                infoTextView?.text= getString(R.string.kerlText)
                imageView?.setImageResource(R.drawable.kerl)
            }
            "Анатолийская кошка"-> {
                infoTextView?.text= getString(R.string.anatoliText)
                imageView?.setImageResource(R.drawable.anatoli)
            }
            "Балинезийская кошка"-> {
                infoTextView?.text= getString(R.string.balinezText)
                imageView?.setImageResource(R.drawable.balinez)
            }
            "Бенгальская кошка"-> {
                infoTextView?.text= getString(R.string.bengalText)
                imageView?.setImageResource(R.drawable.bengal)
            }
            "Бомбейская кошка"-> {
                infoTextView?.text= getString(R.string.bombeiText)
                imageView?.setImageResource(R.drawable.bombei)
            }
            "Британская кошка"-> {
                infoTextView?.text= getString(R.string.britanText)
                imageView?.setImageResource(R.drawable.britan)
            }
            "Бурманская кошка"-> {
                infoTextView?.text= getString(R.string.burmaText)
                imageView?.setImageResource(R.drawable.burma)
            }
            "Гавана"-> {
                infoTextView?.text= getString(R.string.gavanaText)
                imageView?.setImageResource(R.drawable.gavana)
            }
            "Гималайская кошка"-> {
                infoTextView?.text= getString(R.string.gimalaiText)
                imageView?.setImageResource(R.drawable.gimalai)
            }
            "Йоркская кошка"-> {
                infoTextView?.text= getString(R.string.iorkText)
                imageView?.setImageResource(R.drawable.iork)
            }
            "Кимрик"-> {
                infoTextView?.text= getString(R.string.kimrikText)
                imageView?.setImageResource(R.drawable.kimrik)
            }
            "Корат"-> {
                infoTextView?.text= getString(R.string.koratText)
                imageView?.setImageResource(R.drawable.korat)
            }
            "Лаперм"-> {
                infoTextView?.text= getString(R.string.lapermText)
                imageView?.setImageResource(R.drawable.laperm)
            }
            "Мейн-кун"-> {
                infoTextView?.text= getString(R.string.meinKunText)
                imageView?.setImageResource(R.drawable.mein)
            }
            "Сосоке"-> {
                infoTextView?.text= getString(R.string.sosokeText)
                imageView?.setImageResource(R.drawable.sosokee)
            }
            "Скиф-тай-дон"-> {
                infoTextView?.text= getString(R.string.skifText)
                imageView?.setImageResource(R.drawable.skif)
            }
            "Сервал"-> {
                infoTextView?.text= getString(R.string.servalText)
                imageView?.setImageResource(R.drawable.servall)
            }
        }
    }
}
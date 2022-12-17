package com.example.catbreedsapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class ListFragment: Fragment(){
    internal interface OnFragmentSendDataListener {

        fun onSendData(data: String?)
    }
    private var fragmentSendDataListener: OnFragmentSendDataListener? = null
    var countries = arrayOf<String?>("Абиссинская кошка", "Австралийский мист", "Азиатская табби", "Американский бобтейл", "Американский кёрл", "Анатолийская кошка","Балинезийская кошка", "Бенгальская кошка", "Бомбейская кошка","Британская кошка","Бурманская кошка","Гавана","Гималайская кошка","Йоркская кошка","Кимрик","Корат","Лаперм","Мейн-кун","Сосоке","Скиф-тай-дон","Сервал")


    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            fragmentSendDataListener = context as OnFragmentSendDataListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                context.toString()
                        + " должен реализовывать интерфейс OnFragmentInteractionListener"
            )
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_list, container,
            false)
        val countriesList = view.findViewById<ListView>(R.id.cat_listView)
        val adapter: ArrayAdapter<String?> =
            ArrayAdapter((context)!!, android.R.layout.simple_list_item_1,
                countries)
        countriesList.adapter = adapter
        countriesList.onItemClickListener =
            AdapterView.OnItemClickListener { parent, v, position, id ->
                val selectedItem: String = parent.getItemAtPosition(position)
                        as String
                fragmentSendDataListener!!.onSendData(selectedItem)
            }
        return view
    }
}
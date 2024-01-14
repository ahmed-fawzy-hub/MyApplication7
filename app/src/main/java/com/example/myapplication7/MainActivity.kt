package com.example.myapplication7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var listView : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView1)
        var list = mutableListOf<Persons>()

        list.add(Persons("Muhammed" , "Essa"  ,"Kirkuk" , R.drawable.person  ))
        list.add(Persons("Ahmed" , "Walid"  ,"Baghdad" , R.drawable.auth_ic  ))
        list.add(Persons("Osama" , "Samir"  ,"Erbil" , R.drawable.email  ))
        list.add(Persons("Ali" , "Mahmood"  ,"Sulymaniya" , R.drawable.face  ))
        list.add(Persons("Omer" , "Sami"  ,"Wasit" , R.drawable.download  ))


        val adapter = MyListAdapter(this,R.layout.my_list_item,list)

        listView.adapter = adapter
    }
}
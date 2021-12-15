package com.example.lisviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {


    var listitems = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gir=findViewById<EditText>(R.id.textgir)
        var buton=findViewById<Button>(R.id.kaydetbuttonu)
        val listView=findViewById<ListView>(R.id.listView)



        val  tarih= Date()
        //tarih.time
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listitems)
        //listView.adapter=adapter
        listView.adapter= adapter

        buton.setOnClickListener{
           listitems.add(gir.text.toString())
           // listitems.add(tarih.time.toString())
            adapter.notifyDataSetChanged()
             gir.setText("")
        }



    }
}
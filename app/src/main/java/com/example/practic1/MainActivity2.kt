package com.example.practic1

import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var info:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        info = findViewById(R.id.txtv2)
      val i = intent
       val name =i.getStringExtra("tag")
        val location = i.getStringExtra("tag1")
        info.text="Name: $name       Location $location"

    }

}

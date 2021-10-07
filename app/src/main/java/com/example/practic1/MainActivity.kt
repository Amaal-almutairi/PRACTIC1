package com.example.practic1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var location:EditText
    lateinit var go : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.num)
        location = findViewById(R.id.loc)
        go = findViewById(R.id.b1)

        go.setOnClickListener {
          var namws = name.text.toString()
            var loc = location.text.toString()
            var i = Intent(this, MainActivity2::class.java)
            i.putExtra("tag",name.text.toString())
            i.putExtra("tag1",location.text.toString())
            startActivity(i)

        }

    }

}
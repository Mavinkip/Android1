package com.example.update2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val login =findViewById<Button>(R.id.logn1)
        login.setOnClickListener{
            val i = Intent(this@MainActivity2,MainActivity4::class.java)
            startActivity(i)

        }
    }}
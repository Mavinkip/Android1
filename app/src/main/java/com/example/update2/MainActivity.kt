package com.example.update2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the view
        val login =findViewById<Button>(R.id.doctor)
        login.setOnClickListener{
            val e = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(e)}

        val patient=findViewById<Button>(R.id.patient)
        patient.setOnClickListener{

            val i = Intent(this@MainActivity,MainActivity5::class.java)
            startActivity(i)
            // Initialize Firebase Realtime Database reference

        }}
}

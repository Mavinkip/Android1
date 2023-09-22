package com.example.update2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        val medp=findViewById<Button>(R.id.medp)
        val checkup=findViewById<Button>(R.id.checkup)
        medp.setOnClickListener{
            val i = Intent(this@MainActivity6,MainActivity15::class.java)


            startActivity(i)}
        checkup.setOnClickListener{
            val i = Intent(this@MainActivity6,MainActivity10::class.java)


            startActivity(i)}
    }
}
package com.example.update2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val patientin=findViewById<Button>(R.id.btn_sign_in)
        patientin.setOnClickListener{
            val i = Intent(this@MainActivity5,MainActivity6::class.java)
            startActivity(i)}
    }
}
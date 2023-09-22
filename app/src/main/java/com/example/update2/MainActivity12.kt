package com.example.update2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)
        val addD=findViewById<Button>(R.id.addD)
        addD.setOnClickListener{
            val e = Intent(this@MainActivity12,MainActivity8::class.java)
            startActivity(e)}
    }
}
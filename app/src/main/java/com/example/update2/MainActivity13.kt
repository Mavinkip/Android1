package com.example.update2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)

        val addT =findViewById<Button>(R.id.addT)
        addT.setOnClickListener{
            val e = Intent(this@MainActivity13, MainActivity9::class.java)
            startActivity(e)}
    }
}
package com.example.update2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val diag =findViewById<Button>(R.id.diag)
        diag.setOnClickListener{
            val e = Intent(this@MainActivity7,MainActivity12::class.java)
            startActivity(e)}
        val med =findViewById<Button>(R.id.med)
        med.setOnClickListener{
            val e = Intent(this@MainActivity7,MainActivity11::class.java)
            startActivity(e)}
        val tret=findViewById<Button>(R.id.tret)
        tret.setOnClickListener{

            val i = Intent(this@MainActivity7,MainActivity13::class.java)
            startActivity(i)}
    }
}
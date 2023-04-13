package com.example.modul3intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.btnHit)

        btnClick.setOnClickListener {
            val intent = Intent(this, ActivityDua::class.java)
            startActivity(intent)
        }
    }
}
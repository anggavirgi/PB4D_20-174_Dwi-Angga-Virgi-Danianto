package com.example.modul1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton: Button = findViewById(R.id.btn_1)
        val changeText: TextView = findViewById(R.id.tv_change)

        clickButton.setOnClickListener{
            changeText.text = "CONGRATSS!! GAME OVER :)"
        }
    }
}
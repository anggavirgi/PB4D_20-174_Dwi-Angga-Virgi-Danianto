package com.example.modul3intent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityDua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)

        val btnAct = findViewById<Button>(R.id.btnGoto)
        btnAct.setOnClickListener{
            val url = "https://www.alang-alang.id"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            intent.setPackage("com.android.chrome")
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                intent.setPackage(null)
                startActivity(intent)
            }
        }


    }
}
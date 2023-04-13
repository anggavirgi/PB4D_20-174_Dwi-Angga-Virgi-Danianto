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
            // Buat intent untuk membuka website di Chrome
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            intent.setPackage("com.android.chrome")
            // Cek apakah Chrome tersedia pada perangkat
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                // Jika Chrome tidak tersedia, buka URL di browser lain
                intent.setPackage(null)
                startActivity(intent)
            }
        }


    }
}
package com.example.modul2recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modul2recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<Lists>()

        list.addAll(
            arrayOf(
                Lists("Gerry", "Tugas Praktikum", "Assalamualaikum kak, izin mengumpulkan tuga.."),
                Lists("Jerry", "Lapres", "Permisi kak, izin mengumpulkan tugas.."),
                Lists("Michael", "Tugas Praktikum", "Assalamualaikum kak, mau tanya mengenai tug.."),
                Lists("John", "Tugas Praktikum", "Assalamualaikum kak, saya izin tidak masuk p.."),
                Lists("Gaby", "Lapres Praktikum", "Assalamualaikum kak, perkenalkan nama sa.."),
                Lists("Terry", "Laporan Resmi", "Assalamualaikum kak, apakah ada kertas bertu.."),
                Lists("Nial", "Laporan Resmi", "Permisi, mau tanya, tadi saya yang ada di.."),
                Lists("Perry", "Laporan resmi", "1200441100001, Sistem Informasi Universi.."),
                Lists("Julian", "Tugas Praktikum", "Izin mengumpulkan tugas praktikum"),
                Lists("Rex", "Tugas Praktikum", "Assalamualaikum kak, izin mengumpulkan..")
            )
        )

        val myAdapter = MainAdapter(list)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = myAdapter
    }
}
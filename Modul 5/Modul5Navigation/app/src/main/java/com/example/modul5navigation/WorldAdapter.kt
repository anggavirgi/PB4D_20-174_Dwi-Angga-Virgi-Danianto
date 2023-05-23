package com.example.modul5navigation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.modul5navigation.databinding.WorldListBinding

class WorldAdapter(private val list: ArrayList<WorldLists>) : RecyclerView.Adapter<WorldAdapter.MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorldAdapter.MainViewHolder {
        return MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.world_list, parent, false))
    }

    override fun onBindViewHolder(holder: WorldAdapter.MainViewHolder, position: Int) {
        val data = list[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = WorldListBinding.bind(itemView)
        fun bind(data: WorldLists) {
            binding.tvSatu.text = data.negara
            binding.tvDua.text = data.jam
        }

    }
}
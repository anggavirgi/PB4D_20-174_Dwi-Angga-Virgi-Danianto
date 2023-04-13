package com.example.modul2recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.modul2recyclerview.databinding.ItemListBinding

class MainAdapter(private val list: ArrayList<Lists>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val data = list[position]
        holder.bind(data)
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = ItemListBinding.bind(itemView)
        fun bind(data: Lists) {
            binding.tvNama.text = data.nama
            binding.tvSubjek.text = data.subjek
            binding.tvIsi.text = data.isi
        }

    }
}
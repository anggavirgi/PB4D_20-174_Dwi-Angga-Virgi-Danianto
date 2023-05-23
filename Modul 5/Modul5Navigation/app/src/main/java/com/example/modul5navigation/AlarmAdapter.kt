package com.example.modul5navigation

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.modul5navigation.databinding.AlarmListBinding

class AlarmAdapter(private val list: ArrayList<AlarmLists>) : RecyclerView.Adapter<AlarmAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlarmAdapter.MainViewHolder {
        return MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.alarm_list, parent, false))
    }

    override fun onBindViewHolder(holder: AlarmAdapter.MainViewHolder, position: Int) {
        val data = list[position]
        holder.bind(data)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, AlarmDetail::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = AlarmListBinding.bind(itemView)
        fun bind(data: AlarmLists) {
            binding.tvSatu.text = data.jam
        }

    }
}
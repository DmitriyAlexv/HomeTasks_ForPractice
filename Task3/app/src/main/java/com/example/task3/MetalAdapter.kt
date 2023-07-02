package com.example.task3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.task3.databinding.ItemMetalBinding

class MetalAdapter(
    private var metalList: List<Metal>,
    private val onItemClick: (Metal) -> Unit
) : RecyclerView.Adapter<MetalItem>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MetalItem {
        return MetalItem(
            ItemMetalBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onItemClick
        )
    }

    override fun getItemCount(): Int {
        return metalList.size
    }

    override fun onBindViewHolder(holder: MetalItem, position: Int) {
        holder.onBind(metalList[position])
    }
}
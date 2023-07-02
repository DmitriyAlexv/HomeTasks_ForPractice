package com.example.task3

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.task3.databinding.ItemMetalBinding

class MetalItem(
    private val binding: ItemMetalBinding,
    private val onItemClick: (Metal) -> Unit
) : ViewHolder(binding.root) {
    fun onBind(metal: Metal) {
        binding.run {
            tvMain.text = metal.name
            tvSeparator.setBackgroundColor(root.resources.getColor(metal.color))
            root.setOnClickListener {
                onItemClick(metal)
            }
        }
    }
}
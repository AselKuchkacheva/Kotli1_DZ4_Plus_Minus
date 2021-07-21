package com.example.kotli1_dz4_plus_minus.ui.thirdFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotli1_dz4_plus_minus.databinding.ItemClickBinding

class ZnakiAdapter : RecyclerView.Adapter<ZnakiAdapter.ViewHolder>() {

    private var list: ArrayList<String> = arrayListOf()

    fun setList(item: String){
        this.list.add(item)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemClickBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list.get(position))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(private val binding: ItemClickBinding) : RecyclerView.ViewHolder(binding.root)  {

        fun onBind(get: String) {
            binding.tvItem.text = get
        }
    }
}
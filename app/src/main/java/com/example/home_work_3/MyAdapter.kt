package com.example.home_work_3

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val context: Context, private val items: List<Item>) :
    RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = items[position]
        holder.nameView.text = item.name
        holder.emailView.text = item.email
        holder.imageView.setImageResource(item.image)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

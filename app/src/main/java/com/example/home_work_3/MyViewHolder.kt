package com.example.home_work_3

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.imageview)
    val nameView: TextView = itemView.findViewById(R.id.name)
    val emailView: TextView = itemView.findViewById(R.id.email)
}

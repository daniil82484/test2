package com.example.test2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Sensation_adapter(val con:Context, val list: ArrayList<Sensation>):RecyclerView.Adapter<Sensation_adapter.Link>(){
    class Link(itemView: View):RecyclerView.ViewHolder(itemView) {
        val im_di:ImageView = itemView.findViewById(R.id.image)
        val text_di:TextView = itemView.findViewById(R.id.title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Sensation_adapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.sensation_item,parent,false)
        return  Link(root)
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        holder.im_di.setImageResource(list[position].imageId)
        holder.text_di.setText(list[position].title)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
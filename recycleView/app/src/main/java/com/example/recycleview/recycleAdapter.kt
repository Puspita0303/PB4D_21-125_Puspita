package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class recycleAdapter: RecyclerView.Adapter<recycleAdapter.ViewHolder>() {

    private var titles = arrayOf("Decendent of the Sun","Fight For Way","Strong Women Do Bong Son")
    private var details = arrayOf("ajvdfkabd","akidvksbjk","adiyvwbia")
    private var images = intArrayOf(R.drawable.dods, R.drawable.ffw, R.drawable.swdo)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recycleAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: recycleAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }

}
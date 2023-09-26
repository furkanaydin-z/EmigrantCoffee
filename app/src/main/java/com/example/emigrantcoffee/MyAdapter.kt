package com.example.emigrantcoffee

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val hotcoff:ArrayList<hotdata>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemviev = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemviev)
    }

    override fun getItemCount(): Int {
        return hotcoff.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentitem = hotcoff[position]
        holder.titleimage.setImageResource(currentitem.imageid)
        holder.coffeetext.text = currentitem.explain
    }
    class MyViewHolder(itemview: View): RecyclerView.ViewHolder(itemview){

        val titleimage: ShapeableImageView = itemview.findViewById(R.id.latteimage)
        val coffeetext: TextView = itemview.findViewById(R.id.lattetext)
    }
}
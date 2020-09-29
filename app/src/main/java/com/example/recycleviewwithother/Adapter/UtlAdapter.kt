package com.example.recycleviewwithother.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewwithother.R
//import androidx.vectordrawable.animated.R
import com.example.recycleviewwithother.model.Ultilities
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.view.txtName
import kotlinx.android.synthetic.main.ult_item.view.*

class UtlAdapter(var ultList: ArrayList<Ultilities>) :
    RecyclerView.Adapter<UtlAdapter.UltViewHolder>() {
    class UltViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(utl: Ultilities) {
            itemView.txtName.text = utl.name
            itemView.img.setImageResource(utl.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UtlAdapter.UltViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.ult_item, parent, false)
        return  UltViewHolder(view)

    }

    override fun onBindViewHolder(holder: UtlAdapter.UltViewHolder, position: Int) {
       holder.bind(ultList[position])
    }

    override fun getItemCount(): Int =ultList.size
}
package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*

class Adapter(private val list:ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder> () {

//    private var context: Context?=null;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.view.lbList.text = list.get(position).name
        holder.view.halo.text = list.get(position).halo
        holder.itemView.cardList.setOnClickListener {
            Toast.makeText(holder.itemView.context, list.get(position).halo + " " + list.get(position).name, Toast.LENGTH_SHORT).show()
        }
    }

    class Holder(val view: View) : RecyclerView.ViewHolder(view)
}
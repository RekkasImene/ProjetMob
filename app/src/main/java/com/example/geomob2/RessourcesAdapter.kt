package com.example.geomob2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.listview_item.view.*


class RessourcesAdapter(private val mCtx: Context, private val list: List<Ressources>) :
    RecyclerView.Adapter<RessourcesAdapter.RessourcesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):RessourcesViewHolder {
        val view = LayoutInflater.from(mCtx).inflate(com.example.geomob2.R.layout.listressources_item, parent, false)
        return RessourcesViewHolder(view)
    }

    override fun onBindViewHolder(holder: RessourcesViewHolder, position: Int) {
        val p = list[position]
        holder.title.setText(p.ressource)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class RessourcesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        var title: TextView

        init {

            title = itemView.findViewById(com.example.geomob2.R.id.textViewRessources)


        }

        override fun onClick(view: View) {

        }
    }
}




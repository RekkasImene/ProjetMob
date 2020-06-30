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


class PersonnalitesAdapter(private val mCtx: Context, private val list: List<Personnalites>) :
    RecyclerView.Adapter<PersonnalitesAdapter.PersonnalitesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):PersonnalitesViewHolder {
        val view = LayoutInflater.from(mCtx).inflate(com.example.geomob2.R.layout.listpersonnalites_item, parent, false)
        return PersonnalitesViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonnalitesViewHolder, position: Int) {
        val p = list[position]
        holder.title.setText(p.personnalité)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PersonnalitesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        var title: TextView

        init {

            title = itemView.findViewById(com.example.geomob2.R.id.textViewPersonnalites)

        }

        override fun onClick(view: View) {

        }
    }
}




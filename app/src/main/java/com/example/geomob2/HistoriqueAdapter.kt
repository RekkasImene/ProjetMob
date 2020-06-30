package com.example.geomob2

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.listview_item.view.*
import java.net.URL


class HistoriqueAdapter(private val mCtx: Context, private val list: List<Historique>) :
    RecyclerView.Adapter<HistoriqueAdapter.HistViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):HistViewHolder {
        val view = LayoutInflater.from(mCtx).inflate(R.layout.listhistorique_item, parent, false)
        return HistViewHolder(view)

    }

    override fun onBindViewHolder(holder: HistViewHolder, position: Int) {
        val p = list[position]
        holder.title.setText(p.hist)
        holder.date.setText(p.date)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class HistViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        var title: TextView
        var date :TextView

        init {

            title= itemView.findViewById(com.example.geomob2.R.id.textViewHistorique)
            date=  itemView.findViewById(com.example.geomob2.R.id.textViewDate)

        }

        override fun onClick(view: View) {


        }

    }}




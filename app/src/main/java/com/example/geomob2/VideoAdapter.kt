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


class VideoAdapter(private val mCtx: Context, private val list: List<Videos>) :
    RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):VideoViewHolder {
        val view = LayoutInflater.from(mCtx).inflate(R.layout.video_row, parent, false)
        return VideoViewHolder(view)

    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val p = list[position]
        holder.video.settings.javaScriptEnabled = true
        holder.video.webViewClient = WebViewClient()
        holder.video.loadData(p.video,"text/html","utf-8")

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        var video: WebView

        init {

            video = itemView.findViewById(com.example.geomob2.R.id.webView)

        }

        override fun onClick(view: View) {


        }

}}




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


class CountryAdapter(private val mCtx: Context, private val list: List<Country>) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CountryViewHolder {
        val view = LayoutInflater.from(mCtx).inflate(com.example.geomob2.R.layout.listview_item, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val p = list[position]
        holder.image.setImageResource(p.image)
        holder.title.setText(p.title)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        var image: ImageView
        var title: TextView

        init {

            image= itemView.findViewById(com.example.geomob2.R.id.imageView)
            title = itemView.findViewById(com.example.geomob2.R.id.textView)


            itemView.setOnClickListener(this)
        }

        override fun onClick(view: View) {
            val i = list[adapterPosition]
            val intent =Intent(mCtx, DetailActivity::class.java)
            intent.putExtra("Country", i)

            mCtx.startActivity(intent)
        }
    }
}




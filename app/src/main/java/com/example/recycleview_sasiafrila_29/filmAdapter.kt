package com.example.recycleview_sasiafrila_29

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class filmAdapter(private val context: Context, private val film: List<film>, val listener:(film) ->(Unit))
    : RecyclerView.Adapter<filmAdapter.filmViewHolder>(){

    class filmViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgFilm = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameFilm = view.findViewById<TextView>(R.id.tv_item_name)
        val descFilm = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(film: film, listemer: (film) -> Unit) {
            imgFilm.setImageResource(film.imgFilm)
            nameFilm.text = film.nameFilm
            descFilm.text = film.descfilm
            itemView.setOnClickListener{
                listemer(film)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): filmViewHolder {
        return filmViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_film, parent, false)
        )
    }

    override fun onBindViewHolder(holder: filmViewHolder, position: Int) {
        holder.bindView(film[position], listener)
    }

    override fun getItemCount(): Int = film.size

    }


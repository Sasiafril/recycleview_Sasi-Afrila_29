package com.example.recycleview_sasiafrila_29

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.ActionMode

class DetailFilmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_film)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val film = intent.getParcelableExtra<film>(MainActivity.INTENT_PARCELABLE)

        val imgFilm = findViewById<ImageView>(R.id.img_item_photo)
        val nameFilm = findViewById<TextView>(R.id.tv_item_name)
        val descFilm = findViewById<TextView>(R.id.tv_item_description)

        imgFilm.setImageResource(film?.imgFilm!!)
        nameFilm.text = film.nameFilm
        descFilm.text = film.descfilm

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    }

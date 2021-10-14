package com.example.recycleview_sasiafrila_29

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class film(
    val imgFilm: Int,
    val nameFilm: String,
    val descfilm: String,
) : Parcelable

package com.example.recycleview_sasiafrila_29

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filmList = listOf<film>(
            film(
                R.drawable.dory,
                "Dory",
                "Dory,Sebagai seorang anak, terpisah dari orangtuanya. Saat ia tumbuh, Dory mencoba untuk mencari mereka, secara bertahap melupakan mereka karena kehilangan memori jangka pendeknya. Setelah sengaja bertabrakan dengan Marlin , seekor ikan badut, yang sedang mencari anaknya. Dia pergi untuk membantunya."
            ),
            film(
                 R.drawable.aladin,
                "Aladin",
                "Aladdin, tikus jalanan muda yang baik hati yang tinggal di kota Arab Agrabah, bersama dengan monyet peliharaannya Abu, menyelamatkan dan berteman dengan Putri Jasmine, yang telah menyelinap keluar dari istana untuk menjelajah, bosan dengan kehidupannya yang terlindung. Sementara itu, Wazir Agung Jafar berencana menggulingkan ayah Jasmine sebagai Sultan."
            ),
            film(
                R.drawable.titanic,
                "Titanic",
                 "Sinopsis Pada tahun 1996, pemburu harta karun Brock Lovett (Bill Paxton) dan timnya di atas kapal penelitian Keldysh mencari di bangkai kapal RMS Titanic untuk mencari kalung dengan berlian langka, Heart of the Ocean. Mereka menemukan brankas berisi gambar seorang wanita muda yang hanya mengenakan kalung."
            ),
            film(
                R.drawable.bumbelbee,
                "Bumbelbee",
                "Dalam pelarian pada tahun 1987 , Bumblebee menemukan perlindungan di tempat barang rongsokan di kota pantai kecil California. Di puncak usianya yang ke-18 dan mencoba menemukan tempatnya di dunia, Charlie Watson menemukan Bumblebee, terluka akibat pertempuran dan hancur."
            ),
            film(
                R.drawable.maleficent,
                "Maleficent",
                "Seorang wanita muda yang cantik dan berhati murni, Maleficent memiliki kehidupan yang indah tumbuh di kerajaan hutan yang damai, sampai suatu hari ketika tentara menyerang mengancam keharmonisan tanah. Maleficent naik menjadi pelindung paling ganas di negeri itu, tetapi dia akhirnya menderita pengkhianatan yang kejam - suatu tindakan yang mulai mengubah hatinya yang murni menjadi batu"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_film)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = filmAdapter(this,filmList){
            val intent = Intent (this, DetailFilmActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
 }

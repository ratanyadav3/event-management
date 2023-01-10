package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_infoactivity.*

class infoactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infoactivity)
        val imageNews : ImageView =findViewById(R.id.clubImage)
        val titleNews :TextView =findViewById(R.id.clubName)
        val newsb : TextView =findViewById(R.id.newsTitleDetail)
        val newsd: TextView=findViewById(R.id.newsDetail)
        val bundle : Bundle?=intent.extras
        val imageId : Int ? = bundle?.getInt("" +
                "e")
        val title=bundle!!.getString("Title")
        val news=bundle.getString("News")
        val subTitle=bundle.getString("SubTitle")
        imageId?.let { imageNews.setImageResource(it) }
        titleNews.text= clubName.toString()
        newsb.text= newsTitleDetail.toString()
        newsd.text= newsDetail.toString()
    }
}
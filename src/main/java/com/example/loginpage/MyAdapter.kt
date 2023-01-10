package com.example.loginpage


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.loginpage.about as about

class  MyAdapter(private val AboutList :ArrayList<about>, ) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    private lateinit var mListener: onItemClickListener
    interface onItemClickListener{
        fun onItemClick(position: Int)
    }
    fun setOnItemClickListener(listener:onItemClickListener){
        mListener=listener
    }

      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
         val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
         return MyViewHolder(itemView,mListener)
     }

     override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       var currentItem = AboutList[position]
         holder.titleImage.setImageResource(currentItem.ClubImage)
         holder.heading.text=currentItem.heading
         holder.newsTitle.text=currentItem.NewsTitle
         holder.subtitle.text=currentItem.SubTitle

     }
     override fun getItemCount(): Int {
         return AboutList.size
     }
     class MyViewHolder(itemView: View,listener:onItemClickListener) : RecyclerView.ViewHolder(itemView){
         val titleImage : ImageView get() = itemView.findViewById(R.id.clubImage)
         val heading : TextView = itemView.findViewById(R.id.clubName)
         val newsTitle : TextView=itemView.findViewById(R.id.newsTitle)
         val subtitle: TextView=itemView.findViewById(R.id.sub_title)

         init {
             itemView.setOnClickListener {
                 listener.onItemClick(adapterPosition)
             }
         }
         }

     }

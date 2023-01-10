package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.loginpage.databinding.ActivityHome2Binding

class homeActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityHome2Binding
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<about>
    lateinit var imageId: Array<Int>
    lateinit var heading:Array<String>
    lateinit var newstitle:Array<String>
    lateinit var subtitle:Array<String>
    lateinit var info :Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
        imageId= arrayOf(
            R.drawable.icon_badminton,
            R.drawable.icon_baseball,
            R.drawable.icon_basketball,
            R.drawable.icon_bowling,
            R.drawable.icon_cycling,
            R.drawable.icon_golf,
            R.drawable.icon_running,
            R.drawable.icon_soccer,
            R.drawable.icon_swimming,
            R.drawable.icon_tabletennis,
            R.drawable.icon_tennis,
        )
        heading= arrayOf(
            "GDSC",
            "LITERALY",
            "JAGRITI",
            "SPORTS",
            "CLUB5",
            "CLUB6",
            "CLUB7",
            "CLUB8",
            "CLUb9",
            "CLUB10",
            "CLUB11"
        )
        newstitle= arrayOf(
            "President : A",
            "President : A",
            "President : A",
            "President : A",
            "President : A",
            "President : A",
            "President : A",
            "President : A",
            "President : A",
            "President : A",
            "President : A",
        )
        subtitle= arrayOf(
            "MAINMOTIVE : Doing somethimg good",
            "MAINMOTIVE : Doing somethimg good",
            "MAINMOTIVE : Doing somethimg good",
            "MAINMOTIVE : Doing somethimg good",
            "MAINMOTIVE : Doing somethimg good",
            "MAINMOTIVE : Doing somethimg good",
            "MAINMOTIVE : Doing somethimg good",
            "MAINMOTIVE : Doing somethimg good",
            "MAINMOTIVE : Doing somethimg good",
            "MAINMOTIVE : Doing somethimg good",
            "MAINMOTIVE : Doing somethimg good",
        )
        info= arrayOf(
            "I have to write about something to club club history club achievements which type club it is etc  ",
            "I have to write about something to club club history club achievements which type club it is etc  ",
            "I have to write about something to club club history club achievements which type club it is etc  ",
            "I have to write about something to club club history club achievements which type club it is etc  ",
            "I have to write about something to club club history club achievements which type club it is etc  ",
            "I have to write about something to club club history club achievements which type club it is etc  ",
            "I have to write about something to club club history club achievements which type club it is etc  ",
            "I have to write about something to club club history club achievements which type club it is etc  ",
            "I have to write about something to club club history club achievements which type club it is etc  ",
            "I have to write about something to club club history club achievements which type club it is etc  ",
            "I have to write about something to club club history club achievements which type club it is etc  ",
        )
        newRecyclerView= findViewById(R.id.recycler)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newArrayList = arrayListOf<about>()
        getUserdata()
    }
    private fun getUserdata(){
        for(i in imageId.indices ){
            val about = about(imageId[i],heading[i],newstitle[i],subtitle[i])
            newArrayList.add(about)

        }
        var adapter = MyAdapter(newArrayList)
        newRecyclerView.adapter=adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
               // Toast.makeText( this@homeActivity2,"you clicked on $position",Toast.LENGTH_SHORT).show()
                val intent=Intent(this@homeActivity2,infoactivity::class.java)
                intent.putExtra( "ImageId",newArrayList[position].ClubImage)
                intent.putExtra("Title",newArrayList[position].NewsTitle)
                intent.putExtra("NewsTitle",newArrayList[position].NewsTitle)
                intent.putExtra("info",info[position])
                startActivity(intent)
            }

        })
    }
}
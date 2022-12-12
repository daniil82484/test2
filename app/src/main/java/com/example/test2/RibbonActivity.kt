package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView

class RibbonActivity : AppCompatActivity() {

    lateinit var tb:Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ribbon)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        tb=findViewById(R.id.toolbar)



        val poster_res:RecyclerView=findViewById((R.id.rec_view))
        poster_res.adapter=Poster_adapter(this, PosterList().list)

        val poster_res2:RecyclerView=findViewById((R.id.rec_view2))
        poster_res2.adapter=Sensation_adapter(this, SensationList().list)
    }

}
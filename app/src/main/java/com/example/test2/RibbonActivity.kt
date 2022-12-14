package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView

class RibbonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ribbon)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = null


        val poster_res:RecyclerView=findViewById((R.id.rec_view))
        poster_res.adapter=Poster_adapter(this, PosterList().list)

        val poster_res2:RecyclerView=findViewById((R.id.rec_view2))
        poster_res2.adapter=Sensation_adapter(this, SensationList().list)
    }

    //override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    //    menuInflater.inflate(R.menu.toolbar_menu, menu)
    //    return true
    //}
//
    //override fun onOptionsItemSelected(item: MenuItem): Boolean {
    //    when(item.itemId){
    //        android.R.id.list -> {
//
    //        }
    //        R.id.menu -> {
//
    //        }
    //        R.id.avatar -> {
//
    //        }
    //    }
    //    return true
    //}

}
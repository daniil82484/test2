package com.example.test2.ui.home

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.test2.*
import com.example.test2.databinding.ActivityMainHomeBinding
import com.google.android.material.navigation.NavigationView

class MainHomeActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMainHome.toolbar)


        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main_home)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        val poster_res: RecyclerView =findViewById((R.id.rec_view))
        poster_res.adapter= Poster_adapter(this, PosterList().list)

        val poster_res2: RecyclerView =findViewById((R.id.rec_view2))
        poster_res2.adapter= Sensation_adapter(this, SensationList().list)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_home, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main_home)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_avatar -> {
                val poster_res: RecyclerView =findViewById((R.id.rec_view))
                poster_res.adapter= Poster_adapter(this, PosterList().list)

                val poster_res2: RecyclerView =findViewById((R.id.rec_view2))
                poster_res2.adapter= Sensation_adapter(this, SensationList().list)
            }
        }
        return false
    }

}

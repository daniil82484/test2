package com.example.recyclerveiw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun login(view: View) {
        val intent = Intent(this@MainActivity2,SigninActivity::class.java)
        startActivity(intent)
        finish()
    }
}
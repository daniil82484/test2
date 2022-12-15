package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.test2.ui.home.MainHomeActivity
import java.util.regex.Pattern

class SigninActivity : AppCompatActivity() {

    lateinit var email: EditText
    lateinit var pass: EditText

    val pattern = ("[a-z0-9]{1,100}"+"@"+"[a-z]{1,12}"+"\\."+"[a-z]{1,3}")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        email = findViewById(R.id.email)
        pass = findViewById(R.id.pass)
    }
    fun emailValid(text: String):Boolean
    {
        return Pattern.compile(pattern).matcher(text).matches()
    }

    fun login(view: View) {
        if (email.text.toString().isNotEmpty() && pass.text.toString().isNotEmpty())
        {
            if (emailValid(email.text.toString()))
            {
                Toast.makeText(this, "Вход", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@SigninActivity, MainHomeActivity::class.java)
                startActivity(intent)
                finish()
            }
            else
            {
                Toast.makeText(this, "Поле E-mail некорректно заполнено", Toast.LENGTH_SHORT).show()
            }
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Заполните поля")
                .setPositiveButton("OK",  null)
                .create()
                .show()
        }
    }
}
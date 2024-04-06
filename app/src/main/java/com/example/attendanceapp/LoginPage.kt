package com.example.attendanceapp

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val SignUp = findViewById<TextView>(R.id.tVSignUp)
        SignUp.setOnClickListener{
            val i = Intent(this, SignUp_Page::class.java)
            startActivity(i)
        }

        val Login_Btn = findViewById<Button>(R.id.LoginBtn)

        Login_Btn.setOnClickListener{
            val i = Intent(this, LoadingPage::class.java)
            startActivity(i)
        }

    }
}
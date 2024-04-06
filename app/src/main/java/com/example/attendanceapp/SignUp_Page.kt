package com.example.attendanceapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Login = findViewById<TextView>(R.id.tVLogin)
        Login.setOnClickListener{
            val i = Intent(this, LoginPage::class.java)
            startActivity(i)
        }
        val SignUp_Btn = findViewById<Button>(R.id.SignUpBtn)
        SignUp_Btn.setOnClickListener{
            val i = Intent(this, LoginPage::class.java)
            startActivity(i)
        }
    }
}
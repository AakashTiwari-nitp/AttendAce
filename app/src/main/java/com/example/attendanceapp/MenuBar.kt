package com.example.attendanceapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val llWorkAssignment = findViewById<LinearLayout>(R.id.llWorkAssignment)
        llWorkAssignment.setOnClickListener{
            val i = Intent(this, WorkAssignment::class.java)
            startActivity(i)
        }

        val llCheckAttendanceReport = findViewById<LinearLayout>(R.id.llCheckAttendanceReport)
        llCheckAttendanceReport.setOnClickListener{
            val i = Intent(this, CheckAttendanceReport::class.java)
            startActivity(i)
        }

        val llUpgradeToPremium = findViewById<LinearLayout>(R.id.llUpgradeToPremium)
        llUpgradeToPremium.setOnClickListener{
            val i = Intent(this, UpgradeToPremium::class.java)
            startActivity(i)
        }

        val llSettings = findViewById<LinearLayout>(R.id.llSettings)
        llSettings.setOnClickListener{
            val i = Intent(this, Settings::class.java)
            startActivity(i)
        }

        val llSendFeedback = findViewById<LinearLayout>(R.id.llSendFeedback)
        llSendFeedback.setOnClickListener{
            val i = Intent(this, SendFeedback::class.java)
            startActivity(i)
        }
    }
}
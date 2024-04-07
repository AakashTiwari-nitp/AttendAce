package com.example.attendanceapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PhysicsTimeTableAdded : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_physics_time_table_added)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_AddSubject = findViewById<ImageView>(R.id.btn_AddSubject)
        btn_AddSubject.setOnClickListener{
            val i = Intent(this, AddSubject::class.java)
            startActivity(i)
        }

        val btn_Calendar = findViewById<LinearLayout>(R.id.llCalendar)
        btn_Calendar.setOnClickListener{
            val i = Intent(this, April2024::class.java)
            startActivity(i)
        }

        val btnTimeTable = findViewById<LinearLayout>(R.id.llTimeTable)
        btnTimeTable.setOnClickListener{
            val i = Intent(this, TimeTable::class.java)
            startActivity(i)
        }

    }
}
package com.example.attendanceapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class April2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_april2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_TimeTable = findViewById<LinearLayout>(R.id.llTimeTable)
        btn_TimeTable.setOnClickListener{
            val i = Intent(this, TimeTable::class.java)
            startActivity(i)
        }

        val btn_Today = findViewById<LinearLayout>(R.id.ll_Today)
        btn_Today.setOnClickListener{
            val i = Intent(this, ChemistryOption::class.java)
            startActivity(i)
        }

        val btn_Calendar = findViewById<LinearLayout>(R.id.llCalendar)
        btn_Calendar.setOnClickListener{
            val i = Intent(this, April2024::class.java)
            startActivity(i)
        }
    }
}
package com.example.attendanceapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class April2024 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_april2024)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn_Date1 = findViewById<LinearLayout>(R.id.llDate1)
        btn_Date1.setOnClickListener{
            val i = Intent(this, April1::class.java)
            startActivity(i)
        }

        val btn_Date2 = findViewById<LinearLayout>(R.id.llDate2)
        btn_Date2.setOnClickListener{
            val i = Intent(this, April2::class.java)
            startActivity(i)
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
    }
}
package com.example.attendanceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class ChemistryOption : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chemistry_option)

        val btn_Present = findViewById<Button>(R.id.btnPresent)
        btn_Present.setOnClickListener {
            val i = Intent(this, ChemistryPresent::class.java)
            startActivity(i)
        }

        val btn_Absent = findViewById<Button>(R.id.btnAbsent)
        btn_Absent.setOnClickListener {
            val i = Intent(this, ChemistryAbsent::class.java)
            startActivity(i)
        }

        val btn_Cancel = findViewById<Button>(R.id.btnCancel)
        btn_Cancel.setOnClickListener {
            val i = Intent(this, ChemistryCancel::class.java)
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
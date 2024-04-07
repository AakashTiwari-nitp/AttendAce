package com.example.attendanceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class ChemistryAbsent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chemistry_absent)

        val btn_TimeTable = findViewById<LinearLayout>(R.id.llTimeTable)
        btn_TimeTable.setOnClickListener{
            val i = Intent(this, TimeTable::class.java)
            startActivity(i)
        }
    }

}
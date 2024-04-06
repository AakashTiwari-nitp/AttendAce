package com.example.attendanceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

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
    }
}
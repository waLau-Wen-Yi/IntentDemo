package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnAbout : Button = findViewById(R.id.btn_about)
        btnAbout.setOnClickListener {
            val intentAbout: Intent = Intent(this, AboutActivity:: class.java)
            intentAbout.putExtra("studentName", "Ali")
            startActivity(intentAbout)
        }

        var btnCall : Button = findViewById(R.id.btn_call)
        btnCall.setOnClickListener {
            val intentCall: Intent = Intent(Intent.ACTION_CALL)
            intentCall.data = Uri.parse("tel:0123456789")
            startActivity(intentCall)
        }

        var btnFind : Button = findViewById(R.id.btn_find)
        btnFind.setOnClickListener {
            val intentFind: Intent = Intent(Intent.ACTION_VIEW)
            intentFind.data = Uri.parse("geo:-36.869031, -162.762088")
            startActivity(intentFind)
        }
    }
}
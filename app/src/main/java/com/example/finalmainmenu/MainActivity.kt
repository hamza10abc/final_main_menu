package com.example.finalmainmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.editTextDate)
        val simpleDateFormat = SimpleDateFormat("dd.MM.yyyy")
        val currDateAndTime: String = simpleDateFormat.format(Date())
        textView.text = currDateAndTime


        val button: Button = findViewById(R.id.report)
        button.setOnClickListener {
            val intent = Intent(this, reports::class.java)
            startActivity(intent)
        }

    }
}
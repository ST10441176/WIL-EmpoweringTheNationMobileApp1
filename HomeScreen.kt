package com.example.xmwa5112presentation2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeScreen : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewCoursesButton: Button = findViewById(R.id.viewCoursesButton)
        val calculatorFeesButton: Button = findViewById(R.id.calculatorFeesButton)
        val contactUsButton: Button = findViewById(R.id.contactUsButton)

        viewCoursesButton.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }

        calculatorFeesButton.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }

        contactUsButton.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
    }
}
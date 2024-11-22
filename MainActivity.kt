package com.example.xmwa5112presentation2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val homeButton: Button = findViewById(R.id.homeButton)
        val exitButton: Button = findViewById(R.id.exitButton)

        imageView.setImageResource(R.drawable.empowering)

        homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        exitButton.setOnClickListener {
            finish()
        }
    }
}

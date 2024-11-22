package com.example.xmwa5112presentation2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CoursesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        val coursesTextView: TextView = findViewById(R.id.coursesTextView)

        val coursesInfo = """
            Empowering the Nation offers the following six-month courses:

            * First Aid
            * Sewing
            * Landscaping
            * Life Skills

            Their six-week short courses are:

            * Child minding
            * Cooking
            * Garden maintenance
        """.trimIndent()

        coursesTextView.text = coursesInfo
    }
}

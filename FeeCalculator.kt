package com.example.xmwa5112presentation2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FeeCalculatorActivity : AppCompatActivity() {

    private lateinit var courseTypeEditText: EditText
    private lateinit var durationEditText: EditText
    private lateinit var calculateButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fees)

        courseTypeEditText = findViewById(R.id.courseTypeEditText)
        durationEditText = findViewById(R.id.durationEditText)
        calculateButton = findViewById(R.id.calculateButton)
        resultTextView = findViewById(R.id.resultTextView)

        calculateButton.setOnClickListener {
            calculateFee()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun calculateFee() {
        // Get the user input from EditTexts
        val courseType = courseTypeEditText.text.toString().trim()
        val durationText = durationEditText.text.toString().trim()

        // Validate inputs
        if (courseType.isEmpty() || durationText.isEmpty()) {
            resultTextView.text = "Please fill in both fields."
            return
        }

        // Try to convert the duration to an integer
        val duration = durationText.toIntOrNull()

        if (duration == null || duration <= 0) {
            resultTextView.text = "Please enter a valid positive duration."
            return
        }

        // Calculate the fee based on the course type
        val fee = when (courseType.lowercase()) {
            "six-month" -> duration * 100 // Example: $100 per month for a six-month course
            "short" -> duration * 50      // Example: $50 per week for a short course
            else -> {
                resultTextView.text = "Invalid course type. Please enter 'six-month' or 'short'."
                return
            }
        }

        // Display the calculated fee in the result TextView
        resultTextView.text = "Total Fee: $$fee"
    }
}

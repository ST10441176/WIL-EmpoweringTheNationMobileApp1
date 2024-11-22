package com.example.xmwa5112presentation2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.util.Patterns

class ContactUsActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var addressEditText: EditText
    private lateinit var messageEditText: EditText
    private lateinit var submitButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        nameEditText = findViewById(R.id.nameEditText)
        emailEditText = findViewById(R.id.emailEditText)
        addressEditText = findViewById(R.id.addressEditText)
        messageEditText = findViewById(R.id.messageEditText)
        submitButton = findViewById(R.id.submitButton)
        resultTextView = findViewById(R.id.resultTextView)

        submitButton.setOnClickListener {
            submitForm()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun submitForm() {
        val name = nameEditText.text.toString().trim()
        val email = emailEditText.text.toString().trim()
        val address = addressEditText.text.toString().trim()
        val message = messageEditText.text.toString().trim()

        if (name.isBlank() || email.isBlank() || address.isBlank() || message.isBlank()) {
            Toast.makeText(this, "Please fill in all fields.", Toast.LENGTH_SHORT).show()
            return
        }

        if (!isValidEmail(email)) {
            Toast.makeText(this, "Please enter a valid email address.", Toast.LENGTH_SHORT).show()
            return
        }

        Toast.makeText(this, "Thank you for contacting us, $name!", Toast.LENGTH_SHORT).show()
        resultTextView.text = "Message Sent: $message"

        clearForm()
    }

    // Helper function to validate email format
    private fun isValidEmail(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    // Clear the form inputs after successful submission
    private fun clearForm() {
        nameEditText.text.clear()
        emailEditText.text.clear()
        addressEditText.text.clear()
        messageEditText.text.clear()
        resultTextView.text = ""
    }
}
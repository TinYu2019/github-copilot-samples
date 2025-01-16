package com.example.mykotlinapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val editText: EditText = findViewById(R.id.editText)
        
        button.setOnClickListener {
            val inputText = editText.text.toString()
            Toast.makeText(this, "Button clicked: $inputText", Toast.LENGTH_SHORT).show()
        }
    }
}

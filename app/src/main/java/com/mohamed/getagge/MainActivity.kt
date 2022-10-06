package com.mohamed.getagge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val yearOfBirthET = findViewById<EditText>(R.id.yearOfBirth_EditText)
        val ageTV = findViewById<TextView>(R.id.age_textView)
        val calculateBtn = findViewById<Button>(R.id.calculate_button)

        calculateBtn.setOnClickListener {
            val yOB = yearOfBirthET.editableText.toString()
            val age = 2022 - yOB.toInt();
            ageTV.text = age.toString()
        }
    }
}
package com.example.lab1_oop

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.PI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputRadius: EditText = findViewById(R.id.inputRadius)
        val calculateButton: Button = findViewById(R.id.calculateButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        calculateButton.setOnClickListener {
            val radiusText = inputRadius.text.toString()

            if (radiusText.isNotEmpty()) {
                val radius = radiusText.toDoubleOrNull()

                if (radius != null && radius > 0) {
                    val area = PI * radius * radius
                    resultTextView.text = "Площа кола: %.2f".format(area)
                } else {
                    resultTextView.text = "Введіть правильне значення радіуса!"
                }
            } else {
                resultTextView.text = "Поле радіуса не може бути порожнім!"
            }
        }
    }
}
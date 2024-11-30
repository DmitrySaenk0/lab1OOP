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

        val inputDimension: EditText = findViewById(R.id.inputDimension)
        val calculateCircleButton: Button = findViewById(R.id.calculateCircleButton)
        val calculateSquareButton: Button = findViewById(R.id.calculateSquareButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        calculateCircleButton.setOnClickListener {
            val inputText = inputDimension.text.toString()

            if (inputText.isNotEmpty()) {
                val radius = inputText.toDoubleOrNull()

                if (radius != null && radius > 0) {
                    val area = PI * radius * radius
                    resultTextView.text = "Площа кола: %.2f".format(area)
                } else {
                    resultTextView.text = "Введіть правильне значення радіуса!"
                }
            } else {
                resultTextView.text = "Поле не може бути порожнім!"
            }
        }

        calculateSquareButton.setOnClickListener {
            val inputText = inputDimension.text.toString()

            if (inputText.isNotEmpty()) {
                val side = inputText.toDoubleOrNull()

                if (side != null && side > 0) {
                    val area = side * side
                    resultTextView.text = "Площа квадрата: %.2f".format(area)
                } else {
                    resultTextView.text = "Введіть правильне значення сторони!"
                }
            } else {
                resultTextView.text = "Поле не може бути порожнім!"
            }
        }
    }
}
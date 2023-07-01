package com.example.task1

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputLayout
import kotlin.math.floor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.bCalculate)

        val name = findViewById<EditText>(R.id.etName)
        val height = findViewById<EditText>(R.id.etHeight)
        val weight = findViewById<EditText>(R.id.etWeight)
        val age = findViewById<EditText>(R.id.etAge)

        name.addTextChangedListener() {
            findViewById<TextInputLayout>(R.id.tilName).error = null
        }
        height.addTextChangedListener() {
            findViewById<TextInputLayout>(R.id.tilHeight).error = null
        }
        weight.addTextChangedListener() {
            findViewById<TextInputLayout>(R.id.tilWeight).error = null
        }
        age.addTextChangedListener() {
            findViewById<TextInputLayout>(R.id.tilAge).error = null
        }

        button.setOnClickListener() {
            when {
                name.text.isEmpty() || name.text.length > 50 -> {
                    findViewById<TextInputLayout>(R.id.tilName).error = "ERROR"
                    return@setOnClickListener
                }

                height.text.isEmpty() || height.text.toString()
                    .toInt() > 250 || height.text.toString().toInt() <= 0 -> {
                    findViewById<TextInputLayout>(R.id.tilHeight).error = "ERROR"
                    return@setOnClickListener
                }

                weight.text.isEmpty() || weight.text.toString()
                    .toInt() > 250 || weight.text.toString().toInt() <= 0 -> {
                    findViewById<TextInputLayout>(R.id.tilWeight).error = "ERROR"
                    return@setOnClickListener
                }

                age.text.isEmpty() || age.text.toString().toInt() > 150 || age.text.toString()
                    .toInt() <= 0 -> {
                    findViewById<TextInputLayout>(R.id.tilAge).error = "ERROR"
                    return@setOnClickListener
                }

                else -> {
                    val result = calculateBodyIndex(
                        name.text.toString(),
                        height.text.toString().toInt(),
                        weight.text.toString().toInt(),
                        age.text.toString().toInt()
                    )
                    findViewById<TextView>(R.id.tvBodyIndexResult).text = "$result"
                }
            }
        }
    }

    private fun calculateBodyIndex(name: String, height: Int, weight: Int, age: Int): Double {
        return floor(weight.toDouble() / (height / 100.0 * height / 100.0) * (age / name.length) * 100.0) / 100.0
    }
}
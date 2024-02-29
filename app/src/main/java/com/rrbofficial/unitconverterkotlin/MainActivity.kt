package com.rrbofficial.unitconverterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt : EditText = findViewById(R.id.kilo_edit)
        val resulttext : TextView = findViewById(R.id.output_text)
        val btn : Button = findViewById(R.id.button)


    }
}
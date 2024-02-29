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

        val edt : EditText = findViewById(R.id.dollar_edittext)
        val resulttext : TextView = findViewById(R.id.output_text)
        val btn : Button = findViewById(R.id.button)



        btn.setOnClickListener()
        {
            val dollars: Double = edt.text.toString().toDouble()
            resulttext.setText(""+convertToRuppes(dollars) + "\n Ruppes")
        }

    }

    fun convertToRuppes(dollars : Double): Double
    {
    var ruppes  = dollars * 82

        return  ruppes;
    }
}
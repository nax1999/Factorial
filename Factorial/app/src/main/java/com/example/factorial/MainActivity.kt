package com.example.factorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calcular(view: View){
        val editTextNumber: EditText = findViewById(R.id.editTextNumber)
        val btnFactorial: Button = findViewById(R.id.btnFactorial)
        val textViewRespuesta: TextView = findViewById(R.id.textViewRespuesta)
        val numero = editTextNumber.text.toString().toInt()
        var factorial:Long = 1
        GlobalScope.launch {
            for (i in 1..numero) {
                factorial *= i.toLong()
                textViewRespuesta.text = "Factorial: ${factorial.toString()}"
                delay(2000)
            }
        }
    }

}

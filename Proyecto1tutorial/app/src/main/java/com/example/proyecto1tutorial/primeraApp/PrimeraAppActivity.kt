package com.example.proyecto1tutorial.primeraApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.proyecto1tutorial.R

class PrimeraAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primera_app)
        val botonStart = findViewById<AppCompatButton>(R.id.botonStart)
        val editText = findViewById<AppCompatEditText>(R.id.edtName)

        botonStart.setOnClickListener {
            val mensaje = editText.text.toString()
            if (mensaje.isNotEmpty()) {
                val intent = Intent(this, ResultadosActivity::class.java)
                intent.putExtra("mensaje", mensaje)
                startActivity(intent)
            }
        }
    }
}
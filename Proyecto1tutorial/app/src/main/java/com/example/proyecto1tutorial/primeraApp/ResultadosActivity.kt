package com.example.proyecto1tutorial.primeraApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.proyecto1tutorial.R

class ResultadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)
        val textoResultado = findViewById<TextView>(R.id.TextoResultado)
        val mensaje = intent.extras?.getString("mensaje").orEmpty()
        textoResultado.text = "Hola $mensaje"
    }
}
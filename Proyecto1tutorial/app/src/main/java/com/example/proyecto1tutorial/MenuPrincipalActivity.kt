package com.example.proyecto1tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.proyecto1tutorial.IMCApp.IMCCalculatorActivity
import com.example.proyecto1tutorial.primeraApp.PrimeraAppActivity

class MenuPrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)
        val botonSaluda = findViewById<AppCompatButton>(R.id.botonSaludo)
        val botonIMC = findViewById<AppCompatButton>(R.id.IMCBoton)

        botonSaluda.setOnClickListener {
            navegaSaluda()
        }
        botonIMC.setOnClickListener{
            navegaIMC()
        }
    }

    private fun navegaSaluda(){
        val intent = Intent(this, PrimeraAppActivity::class.java)
        startActivity(intent)
    }

    private fun navegaIMC(){
        val intent = Intent(this, IMCCalculatorActivity::class.java)
        startActivity(intent)
    }
}
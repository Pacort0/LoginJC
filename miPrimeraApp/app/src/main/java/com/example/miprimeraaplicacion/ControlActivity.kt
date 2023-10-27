    package com.example.miprimeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ControlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control)

        val usuario = intent.getStringExtra("usuario")
        val password = intent.getStringExtra("password")

        var acceso = Intent(this, MainActivity::class.java)
        if (usuario=="Periko" && password == "adicto"){
            acceso = Intent(this, Bienvenida::class.java)
        } else {
            startActivity(acceso)
        }
        finish()
    }
}
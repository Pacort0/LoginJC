package com.example.appcalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appcalculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Definimos dos valores globales para el usuario y la contraseña del login
    val usuario = "ziskito"
    val passwrd = "1234"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Creamos el binding de esta activity
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Cuando se pulse el botón de acceder:
        binding.btnAcceder.setOnClickListener {
            //Si alguno de los dos campos no coincide con el usuario o contraseña, se muestra un mensaje de error y se ponen ambos campos en blanco
            if(binding.campoUsuario.text.toString() != usuario || binding.campoContrasena.text.toString() != passwrd){
                Toast.makeText(this, "Error, datos incorrectos", Toast.LENGTH_SHORT).show()
                binding.campoUsuario.setText("")
                binding.campoContrasena.setText("")
            } else {
                //Si los valores son correctos, se navega a la otra actividad
                val intent = Intent(this, CalculadoraActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
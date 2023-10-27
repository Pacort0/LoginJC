package com.example.proyecto1tutorial.IMCApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.proyecto1tutorial.IMCApp.IMCCalculatorActivity.Companion.IMC_KEY
import com.example.proyecto1tutorial.R
import java.text.DecimalFormat

class ResultadosIMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados_imc)
        val textoResultado = findViewById<TextView>(R.id.resultadoImc)
        val resultado = intent.extras?.getDouble(IMC_KEY) ?: -1.0

        val df = DecimalFormat("#.##") /*formato*/
        val cleanResultado = df.format(resultado)

        if(cleanResultado.equals("0")){
            val errorIntroduzcan = findViewById<TextView>(R.id.nadaIntroducido)
            errorIntroduzcan.text = "Error, usted no ha introducido sus datos"
        }

        textoResultado.text = "Tu IMC es $cleanResultado"
    }
}
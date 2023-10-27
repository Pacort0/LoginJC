package com.example.appcalculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.appcalculadora.databinding.ActivityCalculadoraBinding

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Creamos el binding de esta actividad
        val bindingCalculadora = ActivityCalculadoraBinding.inflate(layoutInflater)
        setContentView(bindingCalculadora.root)

        //Si se presiona el botón para volver a la pantalla de login
        bindingCalculadora.btnAtras.setOnClickListener {
            //Creamos el intent y lo ejecutamos
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //Si se pulsa el botón de la suma
        bindingCalculadora.btnSuma.setOnClickListener {
            val operando1 = bindingCalculadora.campoPrimerFact.text.toString()
            val operando2 = bindingCalculadora.campoSegundoFact.text.toString()
            //Si los campos no están vacíos, se realizan las operaciones y se imprime por pantalla
            if (!estaVacio(operando1, operando2)){
                val num1 = operando1.toDouble()
                val num2 = operando2.toDouble()
                 val suma = num1 + num2
                bindingCalculadora.campoResultado.text = "Resultado = $suma"
            } else {
                //Si alguno de los campos está vacío, se muestra un mensaje de error por pantalla
                Toast.makeText(this, "Introduzca ambos valores", Toast.LENGTH_SHORT).show()
            }
        }
        //Si se pulsa el botón de la resta:
        bindingCalculadora.btnResta.setOnClickListener {
            val operando1 = bindingCalculadora.campoPrimerFact.text.toString()
            val operando2 = bindingCalculadora.campoSegundoFact.text.toString()
            if (!estaVacio(operando1, operando2)){
                val num1 = operando1.toDouble()
                val num2 = operando2.toDouble()
                val suma = num1 - num2
                bindingCalculadora.campoResultado.text = "Resultado = $suma"
            } else {
                Toast.makeText(this, "Introduzca ambos valores", Toast.LENGTH_SHORT).show()
            }
        }
        //Si se pulsa el botón de multiplicar:
        bindingCalculadora.btnMultiplicacion.setOnClickListener {
            val operando1 = bindingCalculadora.campoPrimerFact.text.toString()
            val operando2 = bindingCalculadora.campoSegundoFact.text.toString()
            if (!estaVacio(operando1, operando2)){
                val num1 = operando1.toDouble()
                val num2 = operando2.toDouble()
                val suma = num1 * num2
                bindingCalculadora.campoResultado.text = "Resultado = $suma"
            } else {
                Toast.makeText(this, "Introduzca ambos valores", Toast.LENGTH_SHORT).show()
            }
        }
        //Si se muestra el botón de dividir:
        bindingCalculadora.btnDivision.setOnClickListener {
            val operando1 = bindingCalculadora.campoPrimerFact.text.toString()
            val operando2 = bindingCalculadora.campoSegundoFact.text.toString()
            //Si alguno de los campos está vacío, se muestra un mensaje de error
            if (estaVacio(operando1, operando2)){
                Toast.makeText(this, "Introduzca valores correctos", Toast.LENGTH_SHORT).show()
            }
            // si no, se comprueba si el segundo operando es 0, ya que no podemos dividir por 0
            else if(operando2.toInt() == 0){
                bindingCalculadora.campoResultado.text = "Resultado = Error"
                Toast.makeText(this, "No se puede dividir por 0", Toast.LENGTH_SHORT).show()
            }
            //Si los dos operandos son válidos, se realiza la operación y se imprime el resultado
            else {
                val num1 = operando1.toDouble()
                val num2 = operando2.toDouble()
                val suma = num1 / num2
                bindingCalculadora.campoResultado.text = "Resultado = $suma"
            }
        }
    }

    /**
     * Función estaVacio() que recibe dos valores string por parámetros y devuelve un valor booleano
     * en función de si el valor está vacío o no.
     */
    private fun estaVacio(operando1:String, operando2:String):Boolean{
        var vacio = false
        if(operando1.isEmpty() or operando2.isEmpty()){
            vacio = true
        }
        return vacio
    }
}
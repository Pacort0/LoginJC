package com.example.proyecto1tutorial.IMCApp

import android.content.Intent
import android.nfc.cardemulation.CardEmulation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.proyecto1tutorial.R
import com.example.proyecto1tutorial.primeraApp.ResultadosActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat
import kotlin.math.pow

class IMCCalculatorActivity : AppCompatActivity() {

    private lateinit var eligeHombre: CardView
    private lateinit var eligeMujer: CardView
    private lateinit var tvAltura: TextView
    private lateinit var rsAltura: RangeSlider
    private lateinit var btnDecreaseWeight: FloatingActionButton
    private lateinit var btnIncreaseWeight: FloatingActionButton
    private lateinit var tvWeight: TextView
    private lateinit var btnIncreaseAge: FloatingActionButton
    private lateinit var btnDecreaseAge: FloatingActionButton
    private lateinit var tvAge: TextView
    private lateinit var btnCalculate: Button
    private var isHombreSelected = false
    private var isMujerSelected = false
    private var currentWeight = 65
    private var currentAge = 30
    private var currentHeight:Double = 120.0

    companion object{
        const val IMC_KEY = "resultadoIMC"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imccalculator)
        initComponents()
        initListeners()
        setWeight()
        setAge()
    }

    private fun initComponents() {
        eligeHombre = findViewById(R.id.hombre)
        eligeMujer = findViewById(R.id.mujer)
        tvAltura = findViewById(R.id.tvHeight)
        rsAltura = findViewById(R.id.rsHeight)
        btnIncreaseWeight = findViewById(R.id.buttonIncreaseW)
        btnDecreaseWeight = findViewById(R.id.buttonDecreaseW)
        tvWeight = findViewById(R.id.tvWeight)
        btnIncreaseAge = findViewById(R.id.buttonIncreaseAge)
        btnDecreaseAge = findViewById(R.id.buttonDecreaseAge)
        tvAge = findViewById(R.id.tvAge)
        btnCalculate = findViewById(R.id.buttonCalculate)
    }

    private fun initListeners() {

        eligeHombre.setOnClickListener {
            isHombreSelected = true
            isMujerSelected = false
            eligeHombre.setCardBackgroundColor(getBackgroundColor(isHombreSelected))
            eligeMujer.setCardBackgroundColor(getBackgroundColor(isMujerSelected))
        }
        eligeMujer.setOnClickListener {
            isMujerSelected = true
            isHombreSelected = false
            eligeHombre.setCardBackgroundColor(getBackgroundColor(isHombreSelected))
            eligeMujer.setCardBackgroundColor(getBackgroundColor(isMujerSelected))
        }
        rsAltura.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##") /*formato*/
            val noZeroHeght = df.format(value)
            tvAltura.text = "$noZeroHeght cm"
            currentHeight = (noZeroHeght.toDouble()/100)
        }
        btnDecreaseWeight.setOnClickListener {
            currentWeight -= 1
            setWeight()
        }
        btnIncreaseWeight.setOnClickListener {
            currentWeight += 1
            setWeight()
        }
        btnDecreaseAge.setOnClickListener {
            currentAge -= 1
            setAge()
        }
        btnIncreaseAge.setOnClickListener {
            currentAge += 1
            setAge()
        }
        btnCalculate.setOnClickListener {
            val intent = Intent(this, ResultadosIMC::class.java)
            intent.putExtra(IMC_KEY, calculateIMC())
            startActivity(intent)
        }
    }

    private fun getBackgroundColor(isViewSelected: Boolean): Int {
        val colorReference = if (isViewSelected)
            R.color.background_component_selected
        else
            R.color.background_component

        return ContextCompat.getColor(this, colorReference)
    }

    private fun setWeight(){
        tvWeight.text = currentWeight.toString()
    }

    private fun setAge(){
        tvAge.text = currentAge.toString()
    }

    private fun calculateIMC():Double{
        val imc = currentWeight / (currentHeight.pow(2))

        return imc
    }
}
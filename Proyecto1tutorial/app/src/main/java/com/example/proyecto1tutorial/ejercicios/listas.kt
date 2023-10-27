package com.example.proyecto1tutorial.ejercicios

val alumnos = listOf<String>("Luisa Gaming", "Francisco Javier", "Isabel Katharina", "Carmen", "Miguelón", "Wan")
val formula1 = mutableListOf<String>("Fernando ALonso", "Max Verstappen", "Lewis Hamilton", "Carlos Sainz")

fun main(){
listaMutable()
}

fun listaMutable(){

    if (formula1.isNotEmpty())
        formula1.add("Oscar Piastri")
        formula1.add(2, "Lando Norris")

    println(formula1)
}

fun listaInmutable(){
    // println(alumnos.size)
    // println(alumnos)
    // println(alumnos.toString())
    // println(alumnos.last())
    //  println(alumnos.first())

    val ejemplo = alumnos.filter { it.contains("a") }
    println(ejemplo)

    alumnos.forEach{ alumno -> println(alumno)}
}
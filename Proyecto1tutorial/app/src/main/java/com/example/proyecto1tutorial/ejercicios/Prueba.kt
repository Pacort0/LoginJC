package com.example.proyecto1tutorial.ejercicios

fun main(){
    println("Hola, funciono")

    val nombre = "Pepe Luis"
    println("Me llamo " + nombre)

    val entero:Int = 98
    var numero = 77
    numero += 6
    println(numero)

    println("Hola, me llamo $nombre y tengo $numero años ")

    println("Si la edad es impar, se muestra 1, si es par, 0: ")

    if (pruebaFunciones(numero) == 0)
        println("La edad es par (0)")
    else
        println("La edad es impar (1)")
}

fun pruebaFunciones(edad : Int):Int {
    var numero:Int = if (edad % 2 == 0){
            0
        } else {
            1
        }
return numero
}
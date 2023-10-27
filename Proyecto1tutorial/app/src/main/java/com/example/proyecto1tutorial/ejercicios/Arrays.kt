package com.example.proyecto1tutorial.ejercicios

val coches = arrayOf(1, 2, 78, 23, 3)
val tenistas = arrayOf("Carlos Alcaraz", "Rafael Nadal", "Novak Djokovic", "Roger Federer")
val moviles = arrayOf("Motorola", "iPhone", "Samsung", "Xiaomi", "Honor")

fun main(){

    for(index:Int in 0..coches.lastIndex) {
        var coche = coches[index]
        println("$index: $coche")
    }
   tenistas.forEachIndexed{ index, tenista ->
       println("$index: $tenista")
   }

    for (position in moviles.indices)
        println(moviles[position])

    for ((position, value) in moviles.withIndex())
        println("La posición $position contiene la marca $value")

    for (tenista in tenistas)
        println("Este tenista es $tenista")
}

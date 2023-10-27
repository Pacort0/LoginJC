package com.example.proyecto1tutorial.ejercicios

fun main(){
var mes = 5
    mesDelAno(mes)
    getTrimestre(mes)
    mes = 19
    mesDelAno(mes)
    getTrimestre(mes)

    resultado(8.9)
}

fun mesDelAno(mes:Int){
    when(mes) {
        1 -> println("El mes $mes es enero")
        2 -> println("El mes $mes es febrero")
        3 -> println("El mes $mes es marzo")
        4 -> println("El mes $mes es abril")
        5 -> println("El mes $mes es mayo")
        6 -> println("El mes $mes es junio")
        7 -> println("El mes $mes es julio")
        8 -> println("El mes $mes es agosto")
        9 -> println("El mes $mes es septiembre")
        10 -> println("El mes $mes es octubre")
        11 -> println("El mes $mes es noviembre")
        12 -> println("El mes $mes es diciembre")
        else -> println("El mes $mes es no es un mes válido")
    }
}

fun getTrimestre(mes: Int){
    when(mes) {
        in 1..3 -> println("El mes $mes pertenece al primer trimestre del año")
        in 4..6 -> println("El mes $mes pertenece al segundo trimestre del año")
        in 7..9 -> println("El mes $mes pertenece al tercer trimestre del año")
        in 10..12 -> println("El mes $mes pertenece al primer trimestre del año")
        !in 1..12 -> println("El mes $mes no es válido")
    }
}

fun resultado(value: Any){
    when(value){
        is Int -> println("El valor $value es un entero")
        is String -> println("El valor $value es una cadena")
        is Boolean -> println("El valor $value es un booleano")
        is Double -> println("El valor $value es un double")
    }
}
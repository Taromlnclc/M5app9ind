package com.example.m5app9ind

import java.util.*

fun main() {
    // Crear scanner
    val scanner = Scanner(System.`in`)

    // Solicitar valor de temperatura
    println("Ingrese temperatura:")
    val temperatura = scanner.nextDouble()

    // Solicitar en que escala
    println("En que escala de temperatura:")
    println("(1) Celsius")
    println("(2) Fahrenheit")
    println("(3) Kelvin")

    // Toma valor del scanner y asignar la funcion correspondiente
    when (scanner.nextInt()) {
        1 -> convertirCelsius(temperatura)
        2 -> convertirFahrenheit(temperatura)
        3 -> convertirKelvin(temperatura)
        else -> println("Opción no válida")
    }
}

// Funcion ingreso celsius
fun convertirCelsius(temperatura: Double) {
    val fahrenheit = (temperatura * 9/5) + 32
    val kelvin = temperatura + 273.15

    println("Temperatura ingresada en Celsius: ${String.format("%.2f", temperatura)} °C")
    println("Temperatura en Fahrenheit: ${String.format("%.2f", fahrenheit)} °F")
    println("Temperatura en Kelvin: ${String.format("%.2f", kelvin)} K")
}
// Funcion ingreso fahrenheint
fun convertirFahrenheit(temperatura: Double) {
    val celsius = (temperatura - 32) * 5/9
    val kelvin = (temperatura - 32) * 5/9 + 273.15

    println("Temperatura ingresada en Fahrenheit: ${String.format("%.2f", temperatura)} °F")
    println("Temperatura en Celsius: ${String.format("%.2f", celsius)} °C")
    println("Temperatura en Kelvin: ${String.format("%.2f", kelvin)} K")
}
// Funcion ingreso Kelvin
fun convertirKelvin(temperatura: Double) {
    val celsius = temperatura - 273.15
    val fahrenheit = (temperatura - 273.15) * 9/5 + 32

    println("Temperatura ingresada en Kelvin: ${String.format("%.2f", temperatura)} K")
    println("Temperatura en Celsius: ${String.format("%.2f", celsius)} °C")
    println("Temperatura en Fahrenheit: ${String.format("%.2f", fahrenheit)} °F")
}
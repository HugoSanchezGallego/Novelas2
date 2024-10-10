package com.example.novelas2

data class Resena(
    val calificacion: Int,
    val comentario: String,
    val usuario: String,
    val timestamp: Long,
    val novelaTitulo: String
)
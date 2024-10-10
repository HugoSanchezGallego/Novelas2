package com.example.novelas2

data class Novela(
    val titulo: String,
    val autor: String,
    val ano: Int,
    val sinopsis: String,
    var esFavorita: Boolean = false
)


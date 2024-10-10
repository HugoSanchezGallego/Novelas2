package com.example.novelas2

enum class Orden(val comparator: Comparator<Novela>) {
    TITULO_ASC(compareBy { it.titulo }),
    TITULO_DESC(compareByDescending { it.titulo }),
    AUTOR_ASC(compareBy { it.autor }),
    AUTOR_DESC(compareByDescending { it.autor })
}
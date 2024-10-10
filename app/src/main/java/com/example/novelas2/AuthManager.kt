package com.example.novelas2

object AuthManager {
    private val users = mutableMapOf<String, String>()

    fun register(username: String, password: String): Boolean {
        if (username in users) return false
        users[username] = password
        return true
    }

    fun authenticate(username: String, password: String): Boolean {
        return users[username] == password
    }
}
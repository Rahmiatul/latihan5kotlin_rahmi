package com.rahmi.latihan5kotlin_rahmi

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomeActivity : AppCompatActivity() {
    private lateinit var txtwelcome : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)
        txtwelcome = findViewById(R.id.txtwelcome)

        var getUsername = intent.getStringExtra("username")
        val getPassword = intent.getStringExtra("password")

        txtwelcome.setText("Hello ${getUsername}! Password adalah ${getPassword}")
    }
}
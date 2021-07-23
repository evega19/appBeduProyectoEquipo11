package com.bedu.appproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val saludoTxtVw = findViewById<TextView>(R.id.textViewAct6)

        val bundle = intent.extras //Sólo creamos la caja de recepción

        val name = bundle?.getString("name")

        saludoTxtVw.text = "Bienvenido $name"

    }
}
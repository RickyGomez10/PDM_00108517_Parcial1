package com.example.parcial11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var btn_juego : Button?=null
    var btn_verpartidos : Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_juego = findViewById(R.id.btn_jugar)
        btn_verpartidos = findViewById(R.id.btn_ver_Partidos)

        btn_juego?.setOnClickListener{

            startActivity(Intent(this, NombreEquipos::class.java))
        }

        btn_verpartidos?.setOnClickListener {
            startActivity(Intent(this, VerPartidos::class.java))
        }
    }
}

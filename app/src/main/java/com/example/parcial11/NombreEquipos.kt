package com.example.parcial11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import org.w3c.dom.Text

class NombreEquipos : AppCompatActivity() {
    var etA : EditText ?= null
    var etB : EditText ?= null
    var btnComenzar : Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nombre_equipos)

        etA = findViewById(R.id.et_equipoA)
        etB = findViewById(R.id.et_equipoB)
        val etAString : String = etA?.text.toString()
        val etBString : String = etB?.text.toString()
        btnComenzar = findViewById(R.id.btn_Comenzar)
        btnComenzar?.setOnClickListener {
            if(TextUtils.isEmpty(etA?.text.toString()) || etA?.text.toString().trim().length <= 0){
                etA?.setError("Campo Obligatorio")

            }else if (TextUtils.isEmpty(etB?.text.toString()) || etB?.text.toString().trim().length <= 0){
                etB?.setError("Campo Obligatorio")
            }else {

                val intent = Intent(this@NombreEquipos, Juego::class.java)
                intent.putExtra("EquipoA", etA?.text.toString())
                intent.putExtra("EquipoB", etB?.text.toString())
                startActivity(intent)
            }

        }


    }
}

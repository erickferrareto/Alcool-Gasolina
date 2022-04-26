package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.button)
        botao.setOnClickListener{
            preenchido()
        }
    }
    fun preenchido(){

        val valorAlcool     = findViewById<TextInputEditText>(R.id.alcool)
        val valorGasolina   = findViewById<TextInputEditText>(R.id.gasolina)
        val resultado       = findViewById<TextView>(R.id.resultado)
        val alcool          = valorAlcool.text.toString()
        val gasolina        = valorGasolina.text.toString()
        val numeroGasolina  = gasolina.toDouble()
        val numeroAlcool    = alcool.toDouble()
        val diferenca = numeroAlcool / numeroGasolina

        if (alcool.isEmpty() || gasolina.isEmpty()) { resultado.text = "Preencha os campos" }

        if (diferenca >= 0.7){
            resultado.text = "É melhor usar Gasolina"
        } else {
            resultado.text = "É melhor usar Alcool"
        }
    }
}


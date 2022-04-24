package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    var valorAlcool = findViewById<TextInputEditText>(R.id.alcool)
    var valorGasolina = findViewById<TextInputEditText>(R.id.gasolina)
    var resultado = findViewById<TextView>(R.id.resultado)
    var botao = findViewById<Button>(R.id.button)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        botao.setOnClickListener{
            preenchido()

        }
    }

    fun preenchido(){
        if(valorAlcool.text.toString() == "" || valorGasolina.text.toString() == ""){
            resultado.text = "Preencha os campos primeiro"
        }
    }


}

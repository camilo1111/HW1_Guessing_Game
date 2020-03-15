package com.uan.hw1_guessinggames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var numRandom: Int = Random.nextInt(0,1000)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Adivinar(view : View){

        val numeroUsuario = findViewById<EditText>(R.id.editTextNumero)
        val numero: Int = numeroUsuario.text.toString().toInt()
        val resultado = findViewById<TextView>(R.id.textViewResultado)

        if (numero > numRandom)
            resultado.text = "Resultado : El numero es menor"
        else if (numero < numRandom)
            resultado.text = "Resultado : El numero es mayor"
        else
            resultado.text = "Resultado : Adivinaste el numero"

    }

    fun Reiniciar(view : View){

        val resultado = findViewById<TextView>(R.id.textViewResultado)
        resultado.text ="Resultado"
        val numeroUsuario = findViewById<EditText>(R.id.editTextNumero)
        numeroUsuario.setText("0")
        numRandom = Random.nextInt(0,1000)
    }
}

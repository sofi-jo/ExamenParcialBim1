package com.example.examenparcialweb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val extras = intent.extras
        val peso = extras?.getInt("peso")?:"Sin Peso"
        val altura = extras?.getInt("altura")?:0
        val ot = extras?.getInt("ot")?:"Occtipucio base de la cola"
        val genero = resources.getStringArray(R.array.Genero)
        val nombre = extras?.getString("nombre")?:"Sin nombre"
        val raza = resources.getStringArray(R.array.Raza)

        val calculoTotal = (peso/(altura * ot))






    }
}
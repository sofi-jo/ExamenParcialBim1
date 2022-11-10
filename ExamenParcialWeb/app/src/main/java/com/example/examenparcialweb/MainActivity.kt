package com.example.examenparcialweb

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_imc.setOnClickListener{
            val saltar: Intent =Intent(this, IMC::class.java)
            startActivity(saltar)
        }
        btn_gchembra.setOnClickListener{
            val salto: Intent = Intent(this,Hembrasd::class.java)
            startActivity(salto)
        }
        btn_gcmacho.setOnClickListener{
            val saltar2: Intent = Intent(this,Machos::class.java)
            startActivity(saltar2)
        }
    }

}

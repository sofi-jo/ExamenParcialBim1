package com.example.examenparcialweb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hembrasd.*

class Hembrasd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hembrasd)
        var v1 = -1.4
        var v2 = 0.7
        var v3 = 4

        btn_calculoH.setOnClickListener(){
            var hs = et_hshem.text.toString().toDouble()
            var cp = et_cphem.text.toString().toDouble()
            var calculo = (v1*hs) + (v2*cp) + 4
            tv_gchembra.setText("$calculo")
        }
        
    }
}
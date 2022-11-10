package com.example.examenparcialweb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_machos.*

class Machos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machos)
        var v1 = -1.7
        var v2 = 0.93
        var v3 = 5

        btn_calculoM.setOnClickListener(){
            var hs = et_hsmac.text.toString().toDouble()
            var cp = et_cpmac.text.toString().toDouble()
            var calculo = (v1 * hs) + (v2 * cp) + 4
            tv_calculomac.setText("$calculo")
        }
    }
}
package com.upc.sistemaestimacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnReg.setOnClickListener {
            val intent: Intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
        btnIng.setOnClickListener {
            val intent: Intent = Intent(this, Rango1::class.java)
            startActivity(intent)
        }
    }
}
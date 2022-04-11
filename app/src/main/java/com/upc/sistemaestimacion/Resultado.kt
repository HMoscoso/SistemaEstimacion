package com.upc.sistemaestimacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.github.anastr.speedviewlib.SpeedView
import com.github.anastr.speedviewlib.Speedometer
import kotlinx.android.synthetic.main.activity_rango.*
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        speedView.speedTo(70F, 4000)

    }
}
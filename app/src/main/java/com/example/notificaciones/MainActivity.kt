package com.example.notificaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numero = (Math.random() * 100_001).toInt()
        Toast.makeText(this, "Número a recordar: ${numero}", Toast.LENGTH_LONG).show()
        btn_controlar.setOnClickListener {
            if (numero == txt_Numero.text.toString().toInt())
                Toast.makeText(this, "Muy bien recordaste el número mostrado.", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "Lo siento pero no es el número que mostré.", Toast.LENGTH_LONG).show()
        }
    }
}
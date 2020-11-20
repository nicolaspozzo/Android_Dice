package com.example.dadoazar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity()  {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTirarDado.setOnClickListener{
            generarDadoAleatorio()


        }
    }

    private fun generarDadoAleatorio() {
        val randomInt = Random().nextInt(6) + 1

        when(randomInt){
            1 -> imageViewDado.setBackgroundResource(R.drawable.dado_1)
            2 -> imageViewDado.setBackgroundResource(R.drawable.dado_2)
            3 -> imageViewDado.setBackgroundResource(R.drawable.dado_3)
            4 -> imageViewDado.setBackgroundResource(R.drawable.dado_4)
            5 -> imageViewDado.setBackgroundResource(R.drawable.dado_5)
            6 -> imageViewDado.setBackgroundResource(R.drawable.dado_6)
            else -> imageViewDado.setBackgroundResource(R.drawable.dado_vacio)
        }

       // Toast.makeText(this,"Number: $randomInt",Toast.LENGTH_SHORT).show()


    }


}

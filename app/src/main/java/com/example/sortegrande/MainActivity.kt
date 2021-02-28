package com.example.sortegrande

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var botao: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.botao = findViewById(R.id.btnCliqueAqui)

        this.botao.setOnClickListener({ clique(it) })

    }


    fun clique(view: View){

        var aleatorio = Random()
        val numbersArray = arrayListOf<Int>()

        while (numbersArray.size < 6) {
            var sorted = aleatorio.nextInt(60)+1
            if (sorted !in numbersArray){
                numbersArray.add(sorted)
            }
        }
        for (number in numbersArray){
            Log.i("SORTEGRANDE",number.toString())
        }
    }
}
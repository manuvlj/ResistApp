package com.manudavid.resistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        private const val EMPTY = ""
        private const val SPACE = " "
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tira_1 = 1
        var tira_2 = 0
        var tira_3:Double = 1.0
        var tolerancia:Double = 1.0

        //Banda uno

        cero_1button.setOnClickListener { tira_1 = 0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        uno_1_button.setOnClickListener { tira_1 = 1
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        dos_1_button.setOnClickListener { tira_1 = 2
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        tres_1_button.setOnClickListener {tira_1 = 3
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        cuatro_1_button.setOnClickListener {tira_1 = 4
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        cinco_1_button.setOnClickListener {tira_1 = 5
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        seis_1_button.setOnClickListener {tira_1 = 6
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        siete_1_button.setOnClickListener {tira_1 = 7
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        ocho_1_button.setOnClickListener {tira_1 = 8
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        nueve_1_button.setOnClickListener {tira_1 = 9
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }

        //Banda dos
        cero_1button.setOnClickListener { tira_2 = 0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        uno_2_button.setOnClickListener { tira_2 = 1
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        dos_2_button.setOnClickListener { tira_2 = 2
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        tres_2_button.setOnClickListener {tira_2 = 3
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        cuatro_2_button.setOnClickListener {tira_2 = 4
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        cinco_2_button.setOnClickListener {tira_2 = 5
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        seis_2_button.setOnClickListener {tira_2 = 6
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        siete_2_button.setOnClickListener {tira_2 = 7
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        ocho_2_button.setOnClickListener {tira_2 = 8
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        nueve_2_button.setOnClickListener {tira_2 = 9
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }

        //Multiplicadores
        ceroPotencia_button.setOnClickListener { tira_3 = 1.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        unoPotencia_button.setOnClickListener { tira_3 = 10.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        dosPotencia_button.setOnClickListener {tira_3 = 100.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        tresPotencia_button.setOnClickListener {tira_3 =1000.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        cuatroPotencia_button.setOnClickListener {tira_3 =10000.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        cincoPotencia_button.setOnClickListener {tira_3 =100000.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        seisPotencia_button.setOnClickListener {tira_3 =1000000.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        sietePotencia_button.setOnClickListener {tira_3 =10000000.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        ochoPotencia_button.setOnClickListener {tira_3 =100000000.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        nuevePotencia_button.setOnClickListener {tira_3 =1000000000.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }

        //Tolerancia
        uno_tol_button.setOnClickListener { tolerancia = 1.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        dos_tol_button.setOnClickListener { tolerancia = 2.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        cinco_tol_button.setOnClickListener {tolerancia = 5.0
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        cerocinco_tol_button.setOnClickListener {tolerancia = 0.5
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        puntocinco_tol_button.setOnClickListener {tolerancia = 0.25
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        veinticinco_tol_button.setOnClickListener {tolerancia = 0.1
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
        puntouno_tol_button.setOnClickListener {tolerancia = 0.05
            calculate(int = tira_1, int1 = tira_2, double = tira_3, double1 = tolerancia) }
    }

    fun calculate (int: Int, int1: Int, double: Double, double1: Double){
        var resultado:Double = 1.0
        resultado = ((int.toDouble() * 10 + int1.toDouble()) * double)
        resistor_textView.setText("$resultado Ω ±$double1%")

    }
}
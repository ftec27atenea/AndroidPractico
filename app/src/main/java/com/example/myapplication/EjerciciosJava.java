package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EjerciciosJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios_java);


        int numero1 = 150;
        int numero2 = 300;
        int resultado = (numero1+numero2)/2;
        System.out.println(resultado);
    }
}
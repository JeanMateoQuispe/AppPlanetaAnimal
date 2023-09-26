package com.example.appplanetaanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t.start();
    }
    Thread t = new Thread(){
        public void run(){
            try {
                sleep(2000);  // Hace que el hilo se detenga durante 2000 milisegundos (2 segundos)
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);//Inicia la actividad "home"
            }catch (Exception e){
                e.printStackTrace(); // Si ocurre una excepción
            }
        }
    };
}
package com.example.appplanetaanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button btIniciarSesión, btRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loadUI();

        //Eventos
        btIniciarSesión.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
        btRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUser();
            }
        });
    }
    private void openUser(){
        Intent intent = new Intent(getApplicationContext(), RegistrarUsuario.class);
        startActivity(intent);
    }
    private void openHome(){
        Intent intent = new Intent(getApplicationContext(), Inicio.class);
        startActivity(intent);
    }

    private void loadUI(){
        btIniciarSesión = findViewById(R.id.btIniciarSesión);
        btRegistrar = findViewById(R.id.btRegistrar);
    }
}
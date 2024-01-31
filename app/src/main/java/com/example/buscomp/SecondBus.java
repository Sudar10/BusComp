package com.example.buscomp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_bus);


        Button btnBron = findViewById(R.id.btnBron);
        btnBron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем Intent для перехода к SecondActivity
                Intent intent = new Intent(SecondBus.this, Bronirovanie.class);

                // Запускаем вторую Activity
                startActivity(intent);
            }
        });

        Button btnOtmena = findViewById(R.id.btnOtmena);
        btnOtmena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем Intent для перехода к SecondActivity
                Intent intent = new Intent(SecondBus.this, Bus.class);

                // Запускаем вторую Activity
                startActivity(intent);
            }
        });
    }
}

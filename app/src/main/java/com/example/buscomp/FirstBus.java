package com.example.buscomp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

public class FirstBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_bus);

        Button btnBron = findViewById(R.id.btnBron);
        btnBron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем Intent для перехода к SecondActivity
                Intent intent = new Intent(FirstBus.this, Bronirovanie.class);

                // Запускаем вторую Activity
                startActivity(intent);
            }
        });

        Button btnOtmena = findViewById(R.id.btnOtmena);
        btnOtmena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем Intent для перехода к SecondActivity
                Intent intent = new Intent(FirstBus.this, Bus.class);

                // Запускаем вторую Activity
                startActivity(intent);
            }
        });
    }
}
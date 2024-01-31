package com.example.buscomp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Bus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
    }

    public void imgBus1(View view) {
        ImageButton imgBus1 = findViewById(R.id.imgBus1);
        imgBus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем Intent для перехода к SecondActivity
                Intent intent = new Intent(Bus.this, FirstBus.class);

                // Запускаем Activity
                startActivity(intent);
            }
        });
    }
    public void imgBus2(View view) {
        ImageButton imgBus2 = findViewById(R.id.imgBus2);
        imgBus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем Intent для перехода к SecondActivity
                Intent intent = new Intent(Bus.this, SecondBus.class);

                // Запускаем Activity
                startActivity(intent);
            }
        });
    }
    public void imgBus3(View view) {
        ImageButton imgBus3 = findViewById(R.id.imgBus3);
        imgBus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем Intent для перехода к SecondActivity
                Intent intent = new Intent(Bus.this, ThirdBus.class);

                // Запускаем Activity
                startActivity(intent);
            }
        });
    }
    public void imgBus4(View view) {
        ImageButton imgBus4 = findViewById(R.id.imgBus4);
        imgBus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем Intent для перехода к SecondActivity
                Intent intent = new Intent(Bus.this, FourthBus.class);

                // Запускаем Activity
                startActivity(intent);
            }
        });
    }
}
package com.example.buscomp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

public class Bronirovanie extends AppCompatActivity {

    CalendarView calender;
    TextView eTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bronirovanie);

        calender = (CalendarView)findViewById(R.id.calendarView1);
        eTxt= (TextView) findViewById(R.id.textView19);


        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                // TODO Auto-generated method stub

                eTxt.setText(dayOfMonth +" / " + (month+1) + " / " + year);

            }
        });
        Button btnOtmenit = findViewById(R.id.btnOtmenit);
        btnOtmenit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем Intent для перехода к SecondActivity
                Intent intent = new Intent(Bronirovanie.this, Bus.class);

                // Запускаем вторую Activity
                startActivity(intent);
            }
        });

        Button btnPtd = findViewById(R.id.btnPtd);
        btnPtd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getSupportFragmentManager();
                MyDialogFragment myDialogFragment = new MyDialogFragment();
                myDialogFragment.show(manager, "myDialog");
            }
        });
    }
}
package com.example.buscomp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;


import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class Registration extends AppCompatActivity {

    private EditText txName, txFamilia, txPhone, txPass, txEmail;
    private String Name, Surname, Phone, Password, Email;
    private FirebaseFirestore BusCompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        BusCompany = FirebaseFirestore.getInstance();

        // инициализируем редактируемый текст и кнопки
        txName = findViewById(R.id.txName);
        txFamilia = findViewById(R.id.txFamilia);
        txPhone = findViewById(R.id.txPhone);
        txPass = findViewById(R.id.txPass);
        txEmail = findViewById(R.id.txEmail);
        Button btnRegistr = findViewById(R.id.btnRegistr);

        // добавление прослушивателя нажатий для кнопки
        btnRegistr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // получение данных из полей edittext.
                Name = txName.getText().toString();
                Surname = txFamilia.getText().toString();
                Phone = txPhone.getText().toString();
                Password = txPass.getText().toString();
                Email = txEmail.getText().toString();

                // проверка текстовых полей, пусты они или нет.
                if (TextUtils.isEmpty(Name)) {
                    txName.setError("Пожалуйста введите Имя");
                } else if (TextUtils.isEmpty(Surname)) {
                    txFamilia.setError("Пожалуйста введите Фамилию");
                } else if (TextUtils.isEmpty(Phone)) {
                    txPhone.setError("Пожалуйста введите Номер телефона");
                } else if (TextUtils.isEmpty(Password)) {
                    txPass.setError("Пожалуйста введите пароль");
                } else if (TextUtils.isEmpty(Email)) {
                    txEmail.setError("Пожалуста введите Email");
                } else {
                    // вызывающий метод для добавления данных в Firebase Firestore.
                    addDataToFirestore(Name, Surname, Phone, Password, Email);

                    // Создаем Intent для перехода к SecondActivity
                    Intent intent = new Intent(Registration.this, Profile.class);

                    // Запускаем Activity
                    startActivity(intent);
                }



            }
        });
    }

    private void addDataToFirestore(String Name, String Surname, String Phone, String Password, String Email) {

        // создаем ссылку на коллекцию для базы данных Firebase Firestore.
        CollectionReference comp = BusCompany.collection("Users");

        // добавление данных
        Base base = new Base(Name, Surname, Phone, Password, Email);

        // приведенный ниже метод используется для добавления данных в Firebase Firestore.
        comp.add(base).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                // после успешного добавления данныx выводится всплывающее сообщение об успешном завершении.
                Toast.makeText(Registration.this, "Вы успешно зарегестрировались, \nДобро пожаловать!", Toast.LENGTH_SHORT).show();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                // этот метод вызывается при сбое процесса добавления данных.
                // отображение всплывающего сообщения при сбое добавления данных.
                Toast.makeText(Registration.this, "Произошла ошибка \n" + e, Toast.LENGTH_SHORT).show();
            }
        });
    }

}


package com.example.buscomp;

import com.google.firebase.firestore.Exclude;

import java.io.Serializable;

public class UpdateProfile implements Serializable {

    // метод получения нашего идентификатора
    public String getId() {
        return id;
    }

    // метод установки для нашего идентификатора
    public void setId(String id) {
        this.id = id;
    }

    // мы используем exclude, потому что
    // мы не сохраняем наш идентификатор
    @Exclude
    private String id;

    // переменные для хранения данных.
    private String Name, Surname, Phone, Email, Password;

    public UpdateProfile() {
        // пустой конструктор, необходимый для Firebase.

    }

    // Конструктор для всех переменных.
    public UpdateProfile(String Name, String Surname, String Phone, String Email, String Password) {
        this.Name = Name;
        this.Surname = Surname;
        this.Phone = Phone;
        this.Email = Email;
        this.Password = Password;
    }

    // getter methods for all variables.
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    // setter method for all variables.
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
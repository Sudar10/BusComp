package com.example.buscomp;

public class Base  {
        private String Name, Surname, Phone, Password, Email;

        public Base() {

        }


        public Base(String Name, String Surname, String Phone, String Password, String Email) {
            this.Name = Name;
            this.Surname = Surname;
            this.Phone = Phone;
            this.Password = Password;
            this.Email = Email;
        }


        public String getName() {

            return Name;
        }

        public void setName(String Name) {

            this.Name = Name;
        }

        public String getSurname() {

            return Surname;
        }


        public void setSurname(String Surname) {

            this.Surname = Surname;
        }

        public String getPhone() {

            return Phone;
        }

        public void setPhone(String Phone) {

            this.Phone = Phone;
        }

        public String getPassword() {

            return Password;
        }

        public void setPassword(String Password) {

            this.Password = Password;
        }
        public String getEmail() {

            return Email;
        }

        public void setEmail(String Email) {

            this.Email = Email;
        }
}

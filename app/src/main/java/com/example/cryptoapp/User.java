package com.example.cryptoapp;

public class User {
    public String fullName, age, email;

    public User(){

    }

    public User(String fullName, String age, String email){
        this.age = age;
        this.email = email;
        this.fullName = fullName;
    }
}

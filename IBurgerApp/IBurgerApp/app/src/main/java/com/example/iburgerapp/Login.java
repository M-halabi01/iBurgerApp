package com.example.iburgerapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    TextView dontHaveAccount,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        dontHaveAccount=findViewById(R.id.dontHaveAccount);
        login=findViewById(R.id.login);

        dontHaveAccount.setOnClickListener(v -> {
            Intent intent=new Intent(Login.this,SignUp.class);
            startActivity(intent);
        });
        login.setOnClickListener(v -> {
            Intent intent=new Intent(Login.this,HomeScreen.class);
            startActivity(intent);
            finish();
        });
    }
}
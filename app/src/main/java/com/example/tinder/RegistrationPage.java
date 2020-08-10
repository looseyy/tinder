package com.example.tinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationPage extends AppCompatActivity {
    private Button mLogin, mRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        mLogin= (Button) findViewById(R.id.login);
        mRegister = (Button) findViewById(R.id.register);
        mLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationPage.this, LoginActivity.class);
                startActivity(intent);
                finish();
                return;

            }
        });
        mRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //when clicked, redirects to registrater page
                Intent intent = new Intent(RegistrationPage.this, RegistrationActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
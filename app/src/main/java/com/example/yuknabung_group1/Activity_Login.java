package com.example.yuknabung_group1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_Login extends AppCompatActivity {

    String email = "@admin";
    String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);

        EditText txtUser=findViewById(R.id.editTextTextEmailAddress);
        EditText txtPass=findViewById(R.id.editTextTextPassword2);
        Button login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtUser.getText().toString().equalsIgnoreCase(email)&&txtPass.getText().toString().equalsIgnoreCase(password)) {
                    startActivity(new Intent(Activity_Login.this,Activity_Login.this,Activity_StartMenu.class));
                }else{
                    Toast.makeText(Activity_Login.this,"Username atau password salah",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
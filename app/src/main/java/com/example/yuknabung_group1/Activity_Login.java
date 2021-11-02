package com.example.yuknabung_group1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);

        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText password = findViewById(R.id.editTextTextPassword2);
        Button login = findViewById(R.id.button);
        TextView register = findViewById(R.id.btn_sign_in);
        register.setOnClickListener(this);
        
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = email.getText().toString();
                String passwordKey = password.getText().toString();

                if(usernameKey.equals("@admin") && passwordKey.equals("admin")) {
                    Toast.makeText(Activity_Login.this, "Login Berhasil", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Activity_Login.this, Activity_StartMenu.class);
                    Activity_Login.this.startActivity(i);
                    finish();
                } else if(usernameKey.trim().equals("") && passwordKey.trim().equals("")){
                    email.setError("Tidak boleh kosong");
                    password.setError("Masukkan password");
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(Activity_Login.this);
                    builder.setMessage("Username atau Password anda salah!").setNegativeButton("Coba Lagi", null).create().show();
                }

            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.btn_sign_in){
        Intent a = new Intent(Activity_Login.this, Sign_in_Activity.class);
        startActivity(a);
    }
}
}
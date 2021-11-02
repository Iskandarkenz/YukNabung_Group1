package com.example.yuknabung_group1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Tampilan_yuknabung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_yuknabung);

        ImageView add_target = findViewById(R.id.imageView4);
        ImageView gitar      = findViewById(R.id.imageView7);
        ImageView iphone     = findViewById(R.id.imageView5);
        ImageView sepatu     = findViewById(R.id.imageView6);


        add_target.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add_target = new Intent(Tampilan_yuknabung.this, Activity_Add_Target.class);
                startActivity(add_target);
    }
    });
        gitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gitar = new Intent(Tampilan_yuknabung.this, Insert_Nominal_Gitar.class);
                startActivity(gitar);
            }
        });
        iphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iphone = new Intent(Tampilan_yuknabung.this, Insert_Nominal_Iphone.class);
                startActivity(iphone);
            }
        });
        sepatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sepatu = new Intent(Tampilan_yuknabung.this, Insert_Nominal_Sepatu.class);
                startActivity(sepatu);
            }
        });}}
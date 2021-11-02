package com.example.yuknabung_group1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button profil = findViewById(R.id.button1);
        Button riwayat = findViewById(R.id.button2);
        Button pengingat = findViewById(R.id.button3);
        Button atur_ulang = findViewById(R.id.button4);

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profil = new Intent(Activity_Settings.this, Activity_UbahProfilEdit.class);
                startActivity(profil);
            }
        });
        riwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent riwayat = new Intent(Activity_Settings.this, History_Activity.class);
                startActivity(riwayat);
            }
        });
        pengingat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pengingat = new Intent(Activity_Settings.this, Activity_Reminder.class);
                startActivity(pengingat);
            }
        });
        atur_ulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atur_ulang = new Intent(Activity_Settings.this, Tampilan_Awal_Sedang_Berjalan.class);
                startActivity(atur_ulang);
            }
        });
    }
}
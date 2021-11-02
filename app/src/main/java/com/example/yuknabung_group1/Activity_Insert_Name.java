package com.example.yuknabung_group1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_Insert_Name extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_name);

        EditText nama_produk = findViewById(R.id.editTextTextPersonName5);
        EditText harga_produk = findViewById(R.id.editTextTextPersonName6);
        EditText durasi_menabung = findViewById(R.id.editTextTextPersonName8);


        editText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText1.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Activity_Insert_Name.class);
                intent.putExtra("message", str);

                startActivity(intent);
            }
        });
    }
}
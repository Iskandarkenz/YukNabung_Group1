package com.example.yuknabung_group1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TampilanEditGitarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_target_gitar);

        ImageView back = findViewById(R.id.imageView6);
        ImageView edit = findViewById(R.id.imageView12);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(TampilanEditGitarActivity.this, Tampilan_Sedang_Berjalan.class);
                startActivity(back);
            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ceklis = new Intent(TampilanEditGitarActivity.this, Nominal_Terkumpul.class);
                startActivity(ceklis);
            }
        });
    }
}
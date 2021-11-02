package com.example.yuknabung_group1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Nominal_Terkumpul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);

        ImageView back = findViewById(R.id.imageView9);
        ImageView ceklis = findViewById(R.id.imageView12);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Nominal_Terkumpul.this, TampilanEditGitarActivity.class);
                startActivity(back);
            }
        });
        ceklis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ceklis = new Intent(Nominal_Terkumpul.this, Sign_in_Activity.class);
                startActivity(ceklis);
            }
        });
    }
}

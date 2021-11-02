package com.example.yuknabung_group1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tampilan_Target_Selesai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_target_selesai);

        ImageView back = findViewById(R.id.imageView30);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Tampilan_Target_Selesai.this, Sign_in_Activity.class);
                startActivity(back);
            }
        });
    }
}
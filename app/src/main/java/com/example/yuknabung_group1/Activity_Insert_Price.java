package com.example.yuknabung_group1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_Insert_Price extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_price);

        text = (TextView)findViewById(R.id.text);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        text.setText(str);
    }
}
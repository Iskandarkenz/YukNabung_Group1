package com.example.yuknabung_group1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Gallery;
import android.widget.ImageView;

public class Activity_Add_Target extends AppCompatActivity implements View.OnClickListener{
    static final int SELECT_PICTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_target);

        ImageView galeriIntent = findViewById(R.id.imageView);
        galeriIntent.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        if (view.getId()== R.id.imageView){
            Intent galleryIntent = new Intent(Intent.ACTION_PICK);
            galleryIntent.setType("image/*");
            startActivityForResult(Intent.createChooser(galleryIntent,"Select Picture"), SELECT_PICTURE);
        }
    }
}
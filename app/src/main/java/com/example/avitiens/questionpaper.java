package com.example.avitiens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class questionpaper extends AppCompatActivity {
    private ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionpaper);
       imageView1=findViewById(R.id.imageView1);
  String str=getIntent().getStringExtra("datapass");
        if (str.equals("iat1")){
            imageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(questionpaper.this, csesubjpicture.class);
                    intent.putExtra("datapass", "IMG_20230101_034101");
                    startActivity(intent);
                }
            });

        }
    }
}
package com.example.avitiens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;

import java.io.File;
import java.io.IOException;

public class gym extends AppCompatActivity {
    private ImageView imageView7;
    private TextView textView20, textView21, textView22, textView23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym);
        // for mess layout
             imageView7 = findViewById(R.id.imageView8);
             textView20 = findViewById(R.id.textView20);
             textView21 = findViewById(R.id.textView21);
            textView22 = findViewById(R.id.textView22);
            textView23 = findViewById(R.id.textView23);



    }
}
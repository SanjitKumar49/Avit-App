package com.sanjit49.avitiens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class developerpage extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developerpage);
        textView=findViewById(R.id.email);
        textView.setText("sanjitkumar32@yahoo.com");
        Linkify.addLinks(textView, Linkify.ALL);
    }
}
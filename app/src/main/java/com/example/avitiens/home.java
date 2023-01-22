package com.example.avitiens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        Thread thread = new Thread() {
            public  void run() {
                try
                {
                    sleep(1000);
                }
                catch(Exception e)
                {
                  e.printStackTrace();
                }
                finally
                {
                startActivity(new Intent(home.this,MainActivity.class));
                finish();
                }
            }

        };thread.start();
    }
}
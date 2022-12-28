package com.example.avitiens;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button button3;
    private  static  int timer=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sh=getSharedPreferences(firstpage.PREFS_NAME,0);
                boolean hs=sh.getBoolean("sanjityadav",false);
                if (hs){
                    startActivity(new Intent(MainActivity.this,Home.class));
                    finish();
                }
                else {
                    startActivity(new Intent(MainActivity.this,firstpage.class));
                    finish();
                }

                }

        },timer);




    }





}
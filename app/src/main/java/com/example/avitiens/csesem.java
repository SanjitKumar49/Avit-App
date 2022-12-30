package com.example.avitiens;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class csesem extends AppCompatActivity {

    private ImageView sem3,sem4,sem5,sem6,sem7,sem8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
        sem3=findViewById(R.id.sem3);
        sem4=findViewById(R.id.sem4);
        sem5=findViewById(R.id.sem5);
        sem6=findViewById(R.id.sem6);
        sem7=findViewById(R.id.sem7);
        sem8=findViewById(R.id.sem8);

        String str = getIntent().getStringExtra("comman");


       if (str.equals("csed")){
            sem4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(csesem.this,csesubj.class);
                    intent.putExtra("5sem","chengedata");
                    startActivity(intent);
                }
            });
            sem5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(csesem.this,csesubj.class);
                    intent.putExtra("5sem","origenaldata");
                    startActivity(intent);
                }
            });
        }
        else if (str.equals("mechd")){
            sem4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(csesem.this,mechsubj.class);

                    startActivity(intent);

                }
            });

            sem5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(csesem.this,mechsubj.class));
                }
            });
        }
         else if (str.equals("eeed")){
            sem4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(csesem.this,eeesubj.class);

                    startActivity(intent);

                }
            });

            sem5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(csesem.this,eeesubj.class));
                }
            });
        }
        else if (str.equals("civild")){
            sem4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(csesem.this,civilsubj.class);

                    startActivity(intent);

                }
            });

            sem5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(csesem.this,civilsubj.class));
                }
            });
        }


        else {
            Toast.makeText(this, "work", Toast.LENGTH_SHORT).show();
        }



    }
}
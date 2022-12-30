package com.example.avitiens;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Dipartment extends AppCompatActivity {
    private ImageView cse,mech,eee,civil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dipartment);
        cse=findViewById(R.id.cse);
        mech=findViewById(R.id.mech);
        eee=findViewById(R.id.eee);
        civil=findViewById(R.id.civil);


       cse.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(Dipartment.this, csesem.class);
               intent.putExtra("comman","csed");
               startActivity(intent);
           }
       });
        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dipartment.this, csesem.class);
                intent.putExtra("comman","mechd");
                startActivity(intent);

            }
        });
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dipartment.this, csesem.class);
                intent.putExtra("comman","eeed");
                startActivity(intent);

            }
        });
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dipartment.this, csesem.class);
                intent.putExtra("comman","civild");
                startActivity(intent);

            }
        });


    }
}
package com.sanjit49.avitiens;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Dipartment extends AppCompatActivity {
    private ImageView cse,mech,eee,civil,ece,ai,cs,bme,pharma,biotech,mechatronics,star;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dipartment);
        cse = findViewById(R.id.cse);
        eee = findViewById(R.id.eee);
        ece = findViewById(R.id.ece);
        ai = findViewById(R.id.ai);
        cs = findViewById(R.id.cs);
        bme = findViewById(R.id.bme);
        pharma = findViewById(R.id.pharma);
        biotech = findViewById(R.id.biotech);
        mechatronics = findViewById(R.id.mechatronics);
        mech = findViewById(R.id.mechanical);
        civil = findViewById(R.id.civil);
        star = findViewById(R.id.star);

        String str = getIntent().getStringExtra("showallsyllabus");{
        if (str.equals("branch")) {
            star.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(Dipartment.this, "Someting new Comes...😍😍", Toast.LENGTH_SHORT).show();
                }
            });

            cse.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, syllabusandsubject.class);
                    intent.putExtra("comman", "csed");
                    startActivity(intent);}

            });
            eee.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, syllabusandsubject.class);
                    intent.putExtra("comman", "eeed");
                    startActivity(intent);
                }
            });
            ece.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, syllabusandsubject.class);
                    intent.putExtra("comman", "eced");
                    startActivity(intent);
                }
            });
            ai.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, syllabusandsubject.class);
                    intent.putExtra("comman", "aid");
                    startActivity(intent);
                }
            });
            cs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, syllabusandsubject.class);
                    intent.putExtra("comman", "csd");
                    startActivity(intent);}
            });
            bme.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, syllabusandsubject.class);
                    intent.putExtra("comman", "bmed");
                    startActivity(intent);
                }
            });
            pharma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, syllabusandsubject.class);
                    intent.putExtra("comman", "pharmad");
                    startActivity(intent);
                }
            });
            biotech.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, syllabusandsubject.class);
                    intent.putExtra("comman", "biotechd");
                    startActivity(intent);
                }
            });
            mechatronics.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, syllabusandsubject.class);
                    intent.putExtra("comman", "mechatronicsd");
                    startActivity(intent);
                }
            });
            mech.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, syllabusandsubject.class);
                    intent.putExtra("comman", "mechd");
                    startActivity(intent);
                }
            });
            civil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, syllabusandsubject.class);
                    intent.putExtra("comman", "civild");
                    startActivity(intent);
                }
            });
        }

                                   //Question-bank & Subject //

        else if (str.equals("paper")) {
            star.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(Dipartment.this, "Someting new Comes...😍😍", Toast.LENGTH_SHORT).show();
                }
            });
            cse.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, notesandquestion.class);
                    intent.putExtra("comman", "csedp");
                    startActivity(intent);
                }
            });
            eee.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, notesandquestion.class);
                    intent.putExtra("comman", "eeedp");
                    startActivity(intent);
                }
            });
            ece.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, notesandquestion.class);
                    intent.putExtra("comman", "ecedp");
                    startActivity(intent);

                }
            });
            ai.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, notesandquestion.class);
                    intent.putExtra("comman", "aidp");
                    startActivity(intent);
                }
            });
            cs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, notesandquestion.class);
                    intent.putExtra("comman", "csdp");
                    startActivity(intent);
                }
            });
            bme.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, notesandquestion.class);
                    intent.putExtra("comman", "bmedp");
                    startActivity(intent);
                }
            });
            pharma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, notesandquestion.class);
                    intent.putExtra("comman", "pharmadp");
                    startActivity(intent);
                }
            });
            biotech.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, notesandquestion.class);
                    intent.putExtra("comman", "biotechdp");
                    startActivity(intent);
                }
            });
            mechatronics.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, notesandquestion.class);
                    intent.putExtra("comman", "mechatronicsdp");
                    startActivity(intent);
                }
            });
            mech.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, notesandquestion.class);
                    intent.putExtra("comman", "mechanicaldp");
                    startActivity(intent);
                }
            });
            civil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Dipartment.this, notesandquestion.class);
                    intent.putExtra("comman", "civildp");
                    startActivity(intent);
                }
            });
        }

        }
    }
}

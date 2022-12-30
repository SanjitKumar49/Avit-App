package com.example.avitiens;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class csesubj extends AppCompatActivity {
    private ImageView sem3ajp,sem3cd,sem3eh,sem3ooad,sem3dmm,sem3dmdw;
    private TextView one,two,three,four,five,six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesubj);

        one = findViewById(R.id.ajpajp);
        two = findViewById(R.id.cdcd);
        three = findViewById(R.id.eheh);
        four = findViewById(R.id.ooadooad);
        five = findViewById(R.id.dmmdmm);
        six = findViewById(R.id.dmdwdmdw);

        sem3ajp = findViewById(R.id.sem5ajp);
        sem3cd = findViewById(R.id.sem5cd);
        sem3eh = findViewById(R.id.sem5eh);
        sem3ooad = findViewById(R.id.sem5ooad);
        sem3dmm = findViewById(R.id.sem5dmm);
        sem3dmdw = findViewById(R.id.sem5dmdw);



        String str = getIntent().getStringExtra("5sem");
        if (str.equals("origenaldata")) {
            sem3ajp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                    intent.putExtra("5sem", "ajp");
                    startActivity(intent);
                }
            });
            sem3cd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                    intent.putExtra("5sem", "IMG_20221230_133036");
                    startActivity(intent);
                }
            });
            sem3eh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                    intent.putExtra("5sem", "IMG_20221230_132933");
                    startActivity(intent);
                }
            });
            sem3ooad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                    intent.putExtra("5sem", "IMG_20221230_133003");
                    startActivity(intent);
                }
            });
            sem3dmm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                    intent.putExtra("5sem", "IMG_20221230_102847");
                    startActivity(intent);
                }
            });
            sem3dmdw.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                    intent.putExtra("5sem", "IMG_20221230_131358");
                    startActivity(intent);
                }
            });

        }
        else if (str.equals("chengedata")) {
            Toast.makeText(this, "process successful", Toast.LENGTH_SHORT).show();
            one.setText("java");
            {
                sem3ajp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("5sem", "IMG_20221230_162305");
                        startActivity(intent);
                    }
                });
            }
            two.setText("CN");
            {
                sem3cd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("5sem", "IMG_20221230_162245");
                        startActivity(intent);
                    }
                });

                three.setText("OS");
                {sem3eh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            intent.putExtra("5sem", "IMG_20221230_162217");
                            startActivity(intent);
                        }
                    });
                }
                four.setText("PQT");
                {sem3ooad.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("5sem", "IMG_20221230_162016");
                        startActivity(intent);
                    }
                });
                }
                five.setText("Egile");
                {sem3dmm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("5sem", "IMG_20221230_162501");
                        startActivity(intent);
                    }
                });
                }
                six.setText("EVS");
                {sem3dmdw.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                        intent.putExtra("5sem", "IMG_20221230_162047");
                        startActivity(intent);
                    }
                });
                }
            }
        } else {
            Toast.makeText(this, "nothing", Toast.LENGTH_SHORT).show();
        }



        }
    }

package com.sanjit49.avitiens;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;;
import android.widget.ImageView;
import android.widget.Toast;



// main class  for mess

public class avitmess extends AppCompatActivity {
    //private ListView list;
      private ImageView mon,tue,wed,thur,fri,stu,sun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avitmess);
        mon=findViewById(R.id.mon);
        tue=findViewById(R.id.tue);
        wed=findViewById(R.id.wed);
        thur=findViewById(R.id.thur);
        fri=findViewById(R.id.fri);
        stu=findViewById(R.id.sat);
        sun=findViewById(R.id.sun);
        String str=getIntent().getStringExtra("weak");
        if (str.equals("northind")) {
            mon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","north1");
                    startActivity(intent);

                }
            });
            tue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","north2");
                    startActivity(intent);

                }
            });
            wed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","north3");
                    startActivity(intent);

                }
            });
            thur.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","north4");
                    startActivity(intent);

                }
            });
            fri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","north5");
                    startActivity(intent);

                }
            });
            stu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","north6");
                    startActivity(intent);

                }
            });
            sun.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","north7");
                    startActivity(intent);

                }
            });
        }
        //  for south
        else if (str.equals("southind")){
            mon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","south1");
                    startActivity(intent);

                }
            });
            tue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","south2");
                    startActivity(intent);

                }
            });
            wed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","south3");
                    startActivity(intent);

                }
            });
            thur.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","south5");
                    startActivity(intent);

                }
            });
            fri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","south5");
                    startActivity(intent);

                }
            });
            stu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","south6");
                    startActivity(intent);

                }
            });
            sun.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, categoricheck.class);
                    intent.putExtra("ind","south7");
                    startActivity(intent);

                }
            });

        }
        else if (str.equals("gym")){
            mon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, gym.class);
                    startActivity(intent);

                }
            });
            tue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, gym.class);
                    startActivity(intent);

                }
            });
            wed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, gym.class);
                    startActivity(intent);

                }
            });
            thur.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, gym.class);
                    startActivity(intent);

                }
            });
            fri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, gym.class);
                    startActivity(intent);

                }
            });
            stu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(avitmess.this, gym.class);
                    startActivity(intent);

                }
            });
            sun.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(avitmess.this, "Today is Holiday...!", Toast.LENGTH_SHORT).show();

                }
            });


        }

   }
}
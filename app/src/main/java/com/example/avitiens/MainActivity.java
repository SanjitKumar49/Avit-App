package com.example.avitiens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView dp,question;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp=findViewById(R.id.dp);
        question=findViewById(R.id.question);

        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Dipartment.class);
                intent.putExtra("showallsyllabus","branch");
                startActivity(intent);

            }
        });
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Dipartment.class);
                intent.putExtra("showallsyllabus","paper");
                startActivity(intent);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.datamenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()) {
            case R.id.dev:
                startActivity(new Intent(MainActivity.this, developerpage.class));
                return true;
            case R.id.camu:
                Intent intent=new Intent(MainActivity.this,webpage.class);
                intent.putExtra("web","https://www.mycamu.co.in/#/?action=chooseInstitution");
                startActivity(intent);
                return true;
            case R.id.avit:
                Intent intent1=new Intent(MainActivity.this,webpage.class);
                intent1.putExtra("web","https://www.avit.ac.in/");
                startActivity(intent1);
                return true;
            case R.id.vmrf:
                Intent intent2=new Intent(MainActivity.this,webpage.class);
                intent2.putExtra("web","https://vmrfdu.edu.in/");
                startActivity(intent2);
                return true;
        }


        return super.onOptionsItemSelected(item);

    }
}
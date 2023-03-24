package com.sanjit49.avitiens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView dp,question,northind,southind,gym,location,canteen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp=findViewById(R.id.dp);
        question=findViewById(R.id.question);
        northind=findViewById(R.id.northind);
        southind=findViewById(R.id.southind);
        gym=findViewById(R.id.gym);
        location=findViewById(R.id.location);
        canteen=findViewById(R.id.canteen);

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
        northind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,avitmess.class);
                intent.putExtra("weak","northind");
                startActivity(intent);
            }
        });
        southind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,avitmess.class);
                intent.putExtra("weak","southind");
                startActivity(intent);
            }
        });
        gym.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              Intent intent=new Intent(MainActivity.this,avitmess.class);
                intent.putExtra("weak","gym");
                startActivity(intent);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,webpage.class);
                intent.putExtra("web","https://www.google.com/maps/place/AARUPADAI+VEEDU+INSTITUTE+OF+TECHNOLOGY/@12.65669,80.1801109,15z/data=!4m5!3m4!1s0x0:0xbf0f1882c4b4ceb1!8m2!3d12.65669!4d80.1801109");
                startActivity(intent);
            }
        });
        canteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, com.sanjit49.avitiens.canteen.class);
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
package com.example.avitiens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class firstpage extends AppCompatActivity {
    private EditText email,password;
    private Button button;
    private TextView textView;
    private FirebaseAuth auth;
    public static  String PREFS_NAME="sanjityadav";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage2);

        email =findViewById(R.id.email);
        password=findViewById(R.id.password);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        auth=FirebaseAuth.getInstance();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(firstpage.this,SignUp.class);
                startActivity(intent);

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String user=email.getText().toString();
                String pass=password.getText().toString();
                if (TextUtils.isEmpty(user)||TextUtils.isEmpty(pass)){
                    Toast.makeText(firstpage.this, "Enter The Both Data.!", Toast.LENGTH_SHORT).show();
                }
                else{
                    singin(user,pass);
                }
            }
        });

    }
    private  void singin(String email,String password){
        auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(firstpage.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                SharedPreferences s=getSharedPreferences(firstpage.PREFS_NAME,0);
                SharedPreferences.Editor editor=s.edit();
                if ((task.isSuccessful())){
                    editor.putBoolean("sanjityadav",true);
                    editor.commit();

                    Intent intent=new Intent(firstpage.this,Home.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(firstpage.this, "Log-in UnSuccessfull.!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
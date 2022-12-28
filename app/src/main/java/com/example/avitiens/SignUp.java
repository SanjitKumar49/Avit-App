package com.example.avitiens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {
    private EditText email,password,confirmpassword;
    private Button button;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        confirmpassword=findViewById(R.id.confirmpassword);
        button=findViewById(R.id.button);
        auth=FirebaseAuth.getInstance();
          button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  String user=email.getText().toString();
                  String pass=password.getText().toString();
                  String confirmpass=confirmpassword.getText().toString();
                  if (TextUtils.isEmpty(pass) ||TextUtils.isEmpty(confirmpass))
                  {
                      Toast.makeText(SignUp.this, "Enter The Both Data.!", Toast.LENGTH_SHORT).show();

                   }
                  else if(TextUtils.isEmpty(user)){
                      Toast.makeText(SignUp.this, "Enter the Email-id.!", Toast.LENGTH_SHORT).show();
                  }
                  else
                  {
                      signup(user,pass);
                  }

              }
          });
    }
    private     void signup(String email,String password){
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(SignUp.this, "Successful Register", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(SignUp.this, "Registion is fail.!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
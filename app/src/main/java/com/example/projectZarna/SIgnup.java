package com.example.projectZarna;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.project.R;
import java.lang.*;
import  java.lang.String;
import com.example.project.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SIgnup extends AppCompatActivity {
    EditText name,email,password;
    Button one;
FirebaseAuth firebaseAuth;
FirebaseDatabase firebaseDatabase;
DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        one=findViewById(R.id.submit);
        firebaseAuth=FirebaseAuth.getInstance();
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String emails=email.getText().toString().trim();
              String passwords=password.getText().toString().trim();
                if(emails.isEmpty())
                {
                    email.setError("email cannot be empty");
                }
                if(passwords.isEmpty())
                {
                    password.setError("password cannot be empty");
                }
                else {
                    firebaseAuth.createUserWithEmailAndPassword(emails,passwords).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                            {
                                Toast.makeText(SIgnup.this, "Sign up successful", Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(SIgnup.this, MainActivity.class);
                                startActivity(intent);
                            }
                            else {
                                Toast.makeText(SIgnup.this, "sign up failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }


            }
        });


    }
}
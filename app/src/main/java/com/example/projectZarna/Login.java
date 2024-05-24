package com.example.projectZarna;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project.R;
import java.lang.*;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.lang.String;
import java.util.Objects;

public class Login extends AppCompatActivity {
    EditText email, password;
    FirebaseAuth firebaseAuth;
    Button one, two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.email);
        firebaseAuth=FirebaseAuth.getInstance();
        password = findViewById(R.id.password);
        one = findViewById(R.id.login_button);
        two = findViewById(R.id.register_button);
       one.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      String emails = email.getText().toString();
                                      String passwords = password.getText().toString();
                                      if(TextUtils.isEmpty(emails))
                                      {
                                          email.setError("email required");
                                          return;
                                      }
                                      if (TextUtils.isEmpty(passwords))
                                      {
                                          password.setError("password required");
                                      }
                                      firebaseAuth.signInWithEmailAndPassword(emails,passwords).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                          @Override
                                          public void onComplete(@NonNull Task<AuthResult> task) {
                                         if(task.isSuccessful())
                                         {
                                             Toast.makeText(Login.this, "Logged in", Toast.LENGTH_SHORT).show();
                                          Intent intent=new Intent(Login.this,MainActivity.class);
                                          startActivity(intent);
                                         }
                                         else {
                                             Toast.makeText(Login.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                                         }

                                          }
                                      });

                                  }
                              });
       two.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(Login.this,SIgnup.class);
               startActivity(intent);

           }
       });
    }
}
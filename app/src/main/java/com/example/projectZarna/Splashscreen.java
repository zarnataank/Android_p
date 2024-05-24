package com.example.projectZarna;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.project.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Splashscreen extends AppCompatActivity {
FirebaseUser firebaseUser;
FirebaseAuth firebaseAuth;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        firebaseAuth=FirebaseAuth.getInstance();
        if(firebaseAuth!=null)
        {
            firebaseUser=firebaseAuth.getCurrentUser();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                FirebaseUser user=firebaseAuth.getCurrentUser();
                if(user==null)
                {
                    Intent intent=new Intent(Splashscreen.this,Login.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Intent intent=new Intent(Splashscreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        },1000);

    }

}
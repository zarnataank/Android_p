package com.example.projectZarna;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.example.project.R;

public class Splashscreen extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread th=new Thread(){
       public  void run()
       {
           try {
               sleep(1000);
           }
           catch (Exception e)
           {
               e.printStackTrace();
           }
           finally {
               Intent intent=new Intent(Splashscreen.this,MainActivity.class);
               startActivity(intent);
           }
       }
        };th.start();



    }
}
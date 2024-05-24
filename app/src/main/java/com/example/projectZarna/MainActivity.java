package com.example.projectZarna;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.project.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    RecyclerView recyclerView;
    List<String> mList;
    MymcqsAdapter adapter;

    FrameLayout frame;
    Toolbar toolbar;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottamnav);
        frame = findViewById(R.id.frame);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       navigationView=findViewById(R.id.navi);
        drawerLayout=findViewById(R.id.drawer);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();



        bottomNavigationView.setOnNavigationItemSelectedListener(nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new tutorials()).commit();

       navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               int id=item.getItemId();
              if(id==R.id.history){
                  getSupportFragmentManager().beginTransaction().replace(R.id.frame,new History()).commit();
              }
              else if (id==R.id.interview)

              {
                  getSupportFragmentManager().beginTransaction().replace(R.id.frame,new Interview()).commit();
              }
              else if(id==R.id.logout)
              {
                  getSupportFragmentManager().beginTransaction().replace(R.id.frame,new fqas()).commit();
              }
               return true;
           }
       });

    }

    private  final BottomNavigationView.OnNavigationItemSelectedListener nav=item ->
    {
        Fragment selectedFragment=null;
        int itemId=item.getItemId();
        if(itemId==R.id.tutorial)
        {
            selectedFragment=new tutorials();
        }
        else if(itemId==R.id.play)
        {
            selectedFragment=new Video();

        }
        else if(itemId==R.id.mcqs)
        {
            selectedFragment=new Mcqs();
        }
        else if (itemId==R.id.questions)
        {
           selectedFragment=new Interview();
            }
        if(selectedFragment!=null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,selectedFragment).commit();
        }
        return true;
    };

}







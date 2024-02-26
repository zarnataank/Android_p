package com.example.projectZarna;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project.R;

import java.util.ArrayList;


public class Interview extends Fragment {
    ArrayList<MyinterviewModel> myinterviewModels;
    MyinterviewAdapter myinterviewAdapter;
    RecyclerView recyclerView;



    public Interview()
    {
        // Required empty public constructor

    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=  inflater.inflate(R.layout.fragment_interview, container, false);
       myinterviewModels=generate();
        recyclerView=view.findViewById(R.id.recycletwo);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
       myinterviewAdapter =new MyinterviewAdapter(myinterviewModels,requireActivity());
        recyclerView.setAdapter(myinterviewAdapter);
       return  view;




    }

    public ArrayList<MyinterviewModel> generate()
    {
        ArrayList<MyinterviewModel> items=new ArrayList<>();
        items.add(new MyinterviewModel("What is OOPS?"));
        items.add(new MyinterviewModel("What are different forms of polymorphism?"));
        items.add(new MyinterviewModel("What is dynamic binding?"));
        items.add(new MyinterviewModel("What is method overriding?"));
        items.add(new MyinterviewModel("Is it possible to override main method?"));
        items.add(new MyinterviewModel("Can method be overriden?"));
        items.add(new MyinterviewModel("What is interface?"));
        items.add(new MyinterviewModel("What isWrapper class "));
        items.add(new MyinterviewModel("Explain FileInputStream?"));
        items.add(new MyinterviewModel("Purpose of using BufferedInputStream"));
        items.add(new MyinterviewModel("Is StringBuffer Mutubale?"));
        items.add(new MyinterviewModel("Give way to create objects in java?"));
        items.add(new MyinterviewModel("Types of constructors in java "));
        items.add(new MyinterviewModel("What is iterator?"));
        items.add(new MyinterviewModel("What is NullPointerException?"));
        items.add(new MyinterviewModel("What is the use of Thread?"));
        return items;




    }


}


package com.example.projectZarna;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project.R;

import java.util.ArrayList;


public class tutorials extends Fragment
{

    MytutorialAdapter mytutorialAdapter;
    ArrayList<MytutorialModel> mytutorialModel;
    RecyclerView recyclerView;


   public tutorials()
   {

   }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tutorial, container, false);
        mytutorialModel=generate();
        recyclerView=view.findViewById(R.id.recycle);
        mytutorialAdapter=new MytutorialAdapter(mytutorialModel,requireActivity());
        recyclerView.setAdapter(mytutorialAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;

    }

   private ArrayList<MytutorialModel> generate()
   {
       ArrayList<MytutorialModel> items=new ArrayList<>();
       items.add(new MytutorialModel("Introduction"));
       items.add(new MytutorialModel("Data types"));
       items.add(new MytutorialModel("Control statement,loops"));
       items.add(new MytutorialModel("Array and wrapper class"));
       items.add(new MytutorialModel("OOP'S basics"));
       items.add(new MytutorialModel("OOP'S features"));
       items.add(new MytutorialModel("OOP'S keywords/methods"));
       items.add(new MytutorialModel("Exception handling"));
       items.add(new MytutorialModel("Multi threading"));
       items.add(new MytutorialModel("Collection Framework"));
       items.add(new MytutorialModel("File Handling"));
       items.add(new MytutorialModel("Applets"));
       items.add(new MytutorialModel("Abstract window toolkit"));
       items.add(new MytutorialModel("Swings"));
       items.add(new MytutorialModel("Networking"));

       return items;
   }


}
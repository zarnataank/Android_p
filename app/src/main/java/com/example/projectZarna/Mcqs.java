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


public class Mcqs extends Fragment {
    ArrayList<MymcqsModel> mymcqsModels;
    MymcqsAdapter mymcqsAdapter;
    RecyclerView recyclerView;


    public Mcqs() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_mcqs, container, false);
        mymcqsModels=generate();
        recyclerView=view.findViewById(R.id.recyclemcqs);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mymcqsAdapter=new MymcqsAdapter(mymcqsModels,requireActivity());
        recyclerView.setAdapter(mymcqsAdapter);
        return view;

    }
    public ArrayList<MymcqsModel> generate()
    {
        ArrayList<MymcqsModel> items=new ArrayList<>();
        items.add(new MymcqsModel("Number of primitive data types in Java are 8" ));
        items.add(new MymcqsModel("Automatic type conversion is possible is int to long"));
        items.add(new MymcqsModel("JDK is java development kit"));
        items.add(new MymcqsModel("JRE is java runtime environment"));
        items.add(new MymcqsModel("JVM is java virtual machine"));
        items.add(new MymcqsModel("Package is group of similar classes,interfaces"));
        items.add(new MymcqsModel("JIT is just in time complier"));
        items.add(new MymcqsModel("Class is not real world entity "));
        items.add(new MymcqsModel("Object is to implement real world entity"));
        items.add(new MymcqsModel("Abstract declared under abstract keyword"));
        items.add(new MymcqsModel("Interface is mechansim to achieve abstraction"));
        items.add(new MymcqsModel("Wrapper convert primitive into object and object into primitive"));
        items.add(new MymcqsModel("AWT abstract window toolkit"));
        items.add(new MymcqsModel("Swing is GUI to create applications "));
        items.add(new MymcqsModel("try-used to specify a block where exception take places"));
        items.add(new MymcqsModel("catch-handle the exception"));
        items.add(new MymcqsModel("finally-execute the code"));
        items.add(new MymcqsModel("throw-to throw exception"));
        items.add(new MymcqsModel("throws-declare the exception "));


        return items;

    }




}
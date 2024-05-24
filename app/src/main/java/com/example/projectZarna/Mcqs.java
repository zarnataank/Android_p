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
        items.add(new MymcqsModel("Number of primitive data types in Java are 8","int,char,byte,short,long,float,double,boolean" ));
        items.add(new MymcqsModel("Hashset","unordered Collection of unique elements" ));
        items.add(new MymcqsModel("Treeset","sorted collection of unique elements" ));
        items.add(new MymcqsModel("Shallow copy","A shallow copy creates a new object with the same reference as the original object," ));
        items.add(new MymcqsModel("Deep copy","deep copy creates a new object with a new reference." ));
        items.add(new MymcqsModel("Wrapper class","A wrapper class in Java is a class whose object contains or surrounds primitive data types." ));
        items.add(new MymcqsModel("Can we declare Pointer in Java","No, Java doesn’t provide the support of Pointer" ));
        items.add(new MymcqsModel("What are Packages in Java?","Packages in Java can be defined as the grouping of related types of classes, interfaces, etc providing access to protection "));
        items.add(new MymcqsModel(" Why Packages are used?","Packages are used in Java in order to prevent naming conflicts, control access"));
        items.add(new MymcqsModel(" What is this keyword in Java?","‘this’ is a keyword used to reference a variable that refers to the current object."));
        items.add(new MymcqsModel(" What is the constructor?","Constructor is a special method that is used to initialize objects."));
        items.add(new MymcqsModel(" When is  constructor called?","Constructor is called when a object is created. The name of constructor is same as of the class."));
        items.add(new MymcqsModel(" Explain inheritance in short?","Inheritance is the method by which the Child class can inherit the features of the Super or Parent class"));
        items.add(new MymcqsModel(" Explain multilevel inheritance in short?","When a child or subclass extends any other subclass a hierarchy of inheritance is created which is known as multilevel inheritance."));
        items.add(new MymcqsModel(" Explain Hierarchical inheritance in short?","When multiple subclasses derive from the same parent class is known as Hierarchical Inheritance."));
        items.add(new MymcqsModel(" Explain Multiple  inheritance in short?","When a child class inherits from multiple parent classes is known as Multiple Inheritance."));
        items.add(new MymcqsModel("  Can the constructor be inherited?","No, we can’t inherit a constructor."));
        items.add(new MymcqsModel("  What are method overloading "," In method overloading two or more methods are shared in the same class with a different signature. "));
        items.add(new MymcqsModel("  What are method overriding "," occurs when a subclass can provide the implementation of a method which is already defined in the parent class or superclass."));
        items.add(new MymcqsModel(" What is Abstraction?"," Abstraction refers to the act of representing essential features without including background details"));
        items.add(new MymcqsModel(" What is Abstract class?"," A class declared as abstract, cannot be instantiated i.e., the object cannot be created."));
        return items;
    }




}
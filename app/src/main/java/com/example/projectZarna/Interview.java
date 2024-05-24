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
        items.add(new MyinterviewModel("Which Access Modifiers Are Available in Java ","private,public,deafault,protected"));
        items.add(new MyinterviewModel(" Which Other Modifiers Are Available in Java and What Is Their Purpose?","final,static,abstract,synchronized"));
        items.add(new MyinterviewModel("What is JDK ","JDK which help programmers with writing, debugging, or maintaining applications."));
        items.add(new MyinterviewModel("what is JRE","Java Runtime Environment. It’s a part of the JDK, but it contains the minimum functionality to run Java applications. "));
        items.add(new MyinterviewModel("What is JVM ","JVM is to enable users to deploy the same Java application into different operating systems "));
        items.add(new MyinterviewModel("What is stack?","stack is a place where the JVM reserves blocks for local variables and additional data"));
        items.add(new MyinterviewModel("What is Heap? ","Every new object is created on the Java heap which is used for a dynamic allocation. "));
        items.add(new MyinterviewModel(" What is Enum?","Enum is a type of class that allows developers to specify a set of predefined constant values. "));
        items.add(new MyinterviewModel("What is Serializable? ","Serialization is a mechanism for saving the state of an object as a sequence of bytes "));
        items.add(new MyinterviewModel("What is Serializable interface? ","We can use the Serializable interface to enable the serializability of a class."));
        items.add(new MyinterviewModel("Explain the concept of Java Generics? ","Generics allow you to create classes, interfaces, and methods that operate with types as parameters, providing  reusability."));
        items.add(new MyinterviewModel("What is the Java Memory Model  ","WJMM defines how threads in Java interact with memory, ensuring proper visibility of shared data and preventing data races."));
        items.add(new MyinterviewModel(" What is the Java Collections Framework, "," The Collections Framework provides classes and interfaces for working with collections of objects, offering reusable data structures and algorithms."));
        items.add(new MyinterviewModel(" What is Annotations  "," Annotations provide metadata about code elements and are used for various purposes like code documentation"));
        items.add(new MyinterviewModel("  concept of multithreading in Java  "," Multithreading allows concurrent execution of multiple threads, enabling efficient utilization of CPU resources and responsiveness in applications."));
        items.add(new MyinterviewModel("  What is a Java Servlet? "," A Java Servlet is a Java class used to handle HTTP requests and generate dynamic web content. "));
        items.add(new MyinterviewModel("  concept of object serialization in Java?"," It allows objects to be saved to files or sent over the network."));
        items.add(new MyinterviewModel("  What is servlet?","Java Servlets are the Java programs that run on the Java-enabled web server or application server."));
        items.add(new MyinterviewModel("  What is property of servlet?","Servlets are capable of handling complex requests obtained from the web server."));
        items.add(new MyinterviewModel("  What is ABT","Java's original platform-dependent windowing, graphics, and user-interface widget toolkit, preceding Swing."));
        items.add(new MyinterviewModel("  What is Swing","Java Swing is used to develop Graphical User Application (GUI), desktop-based applications."));
        return items;
    }


}


package com.example.projectZarna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.R;

import java.util.ArrayList;

public class MyinterviewAdapter extends RecyclerView.Adapter<MyinterviewAdapter.interviews> {
    ArrayList<MyinterviewModel> myinterviewModelArrayList;
    Context context;

    public MyinterviewAdapter(ArrayList<MyinterviewModel> myinterviewModelArrayList,Context context)
    {
        this.myinterviewModelArrayList=myinterviewModelArrayList;
        this.context=context;

    }

    @NonNull
    @Override
    public interviews onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        @SuppressLint("ResourceType") View view=layoutInflater.inflate(R.layout.my_interview,parent,false);
        return new interviews(view);
    }

    @Override
    public void onBindViewHolder(@NonNull interviews holder, int position) {
        MyinterviewModel myinterviewModel=myinterviewModelArrayList.get(position);
        holder.textView.setText(myinterviewModel.text);


    }

    @Override
    public int getItemCount() {
        return myinterviewModelArrayList.size();
    }

    public class interviews extends RecyclerView.ViewHolder {
        TextView textView;
        public interviews(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.texts);

        }
    }
}
